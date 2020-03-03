package io.kubernetes.client.informer.cache;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

/**
 * Cache is a java port of k/client-go's ThreadSafeStore. It basically saves and indexes all the
 * entries.
 */
// TODO(yue9944882): Cache is very similar to a Map, replace/inherit w/ Map interface
public class Cache<ApiType> implements Indexer<ApiType> {

  /** keyFunc defines how to map objects into indices */
  private Function<ApiType, String> keyFunc;

  /**
   * DEPRECATE: use Caches#NAMESPACE_INDEX instead. TODO: remove after 7.0.0
   *
   * <p>NAMESPACE_INDEX is the default index function for caching objects
   */
  @Deprecated public static final String NAMESPACE_INDEX = "namespace";

  /** indexers stores index functions by their names */
  private Map<String, Function<ApiType, List<String>>> indexers = new HashMap<>();

  /** items stores object instances */
  private Map<String, ApiType> items = new HashMap<>();

  /** indices stores objects' keys by their indices */
  private Map<String, Map<String, Set<String>>> indices = new HashMap<>();

  /** lock provides thread-safety */
  // TODO: might remove the lock here and make the methods synchronized
  private ReentrantLock lock = new ReentrantLock();

  public Cache() {
    this(
        Caches.NAMESPACE_INDEX,
        Caches::metaNamespaceIndexFunc,
        Caches::deletionHandlingMetaNamespaceKeyFunc);
  }

  /**
   * Constructor.
   *
   * @param indexName the index name, an unique name representing the index
   * @param indexFunc the index func by which we map multiple object to an index for querying
   * @param keyFunc the key func by which we map one object to an unique key for storing
   */
  public Cache(
      String indexName,
      Function<ApiType, List<String>> indexFunc,
      Function<ApiType, String> keyFunc) {
    this.indexers.put(indexName, indexFunc);
    this.keyFunc = keyFunc;
    this.indices.put(indexName, new HashMap<>());
  }

  /**
   * Add objects.
   *
   * @param obj the obj
   */
  @Override
  public void add(ApiType obj) {
    String key = keyFunc.apply(obj);
    lock.lock();
    try {
      ApiType oldObj = this.items.get(key);
      this.items.put(key, obj);
      this.updateIndices(oldObj, obj, key);
    } finally {
      lock.unlock();
    }
  }

  /**
   * Update the object.
   *
   * @param obj the obj
   */
  @Override
  public void update(ApiType obj) {
    String key = keyFunc.apply(obj);
    lock.lock();
    try {
      ApiType oldObj = this.items.get(key);
      this.items.put(key, obj);
      updateIndices(oldObj, obj, key);
    } finally {
      lock.unlock();
    }
  }

  /**
   * Delete the object.
   *
   * @param obj the obj
   */
  @Override
  public void delete(ApiType obj) {
    String key = keyFunc.apply(obj);
    lock.lock();
    try {
      boolean exists = this.items.containsKey(key);
      if (exists) {
        this.deleteFromIndices(this.items.get(key), key);
        this.items.remove(key);
      }
    } finally {
      lock.unlock();
    }
  }

  /**
   * Replace the content in the cache completely.
   *
   * @param list the list
   * @param resourceVersion the resource version
   */
  @Override
  public void replace(List<ApiType> list, String resourceVersion) {
    lock.lock();
    try {
      Map<String, ApiType> newItems = new HashMap<>();
      for (ApiType item : list) {
        String key = keyFunc.apply(item);
        newItems.put(key, item);
      }
      this.items = newItems;

      // rebuild any index
      this.indices = new HashMap<>();
      for (Map.Entry<String, ApiType> itemEntry : items.entrySet()) {
        this.updateIndices(null, itemEntry.getValue(), itemEntry.getKey());
      }
    } finally {
      lock.unlock();
    }
  }

  /** Resync. */
  @Override
  public void resync() {
    // Do nothing by default
  }

  /**
   * List keys.
   *
   * @return the list
   */
  @Override
  public List<String> listKeys() {
    lock.lock();
    try {
      List<String> keys = new ArrayList<>(this.items.size());
      for (Map.Entry<String, ApiType> entry : this.items.entrySet()) {
        keys.add(entry.getKey());
      }
      return keys;
    } finally {
      lock.unlock();
    }
  }

  /**
   * Get object t.
   *
   * @param obj the obj
   * @return the t
   */
  @Override
  public ApiType get(ApiType obj) {
    String key = this.keyFunc.apply(obj);
    lock.lock();
    try {
      return this.getByKey(key);
    } finally {
      lock.unlock();
    }
  }

  /**
   * List all objects in the cache.
   *
   * @return the list
   */
  @Override
  public List<ApiType> list() {
    lock.lock();
    try {
      List<ApiType> itemList = new ArrayList<>(this.items.size());
      for (Map.Entry<String, ApiType> entry : this.items.entrySet()) {
        itemList.add(entry.getValue());
      }
      return itemList;
    } finally {
      lock.unlock();
    }
  }

  /**
   * Gets get by key.
   *
   * @param key the key
   * @return the get by key
   */
  @Override
  public ApiType getByKey(String key) {
    lock.lock();
    try {
      return this.items.get(key);
    } finally {
      lock.unlock();
    }
  }

  /**
   * Get objects .
   *
   * @param indexName the index name
   * @param obj the obj
   * @return the list
   */
  @Override
  public List<ApiType> index(String indexName, Object obj) {
    lock.lock();
    try {
      if (!this.indexers.containsKey(indexName)) {
        throw new IllegalArgumentException(String.format("index %s doesn't exist!", indexName));
      }
      Function<ApiType, List<String>> indexFunc = this.indexers.get(indexName);
      List<String> indexKeys = indexFunc.apply((ApiType) obj);
      Map<String, Set<String>> index = this.indices.get(indexName);
      if (MapUtils.isEmpty(index)) {
        return new ArrayList<>();
      }
      Set<String> returnKeySet = new HashSet<>();
      for (String indexKey : indexKeys) {
        Set<String> set = index.get(indexKey);
        if (CollectionUtils.isEmpty(set)) {
          continue;
        }
        returnKeySet.addAll(set);
      }

      List<ApiType> items = new ArrayList<>(returnKeySet.size());
      for (String absoluteKey : returnKeySet) {
        items.add(this.items.get(absoluteKey));
      }
      return items;
    } finally {
      lock.unlock();
    }
  }

  /**
   * Index keys list.
   *
   * @param indexName the index name
   * @param indexKey the index key
   * @return the list
   */
  @Override
  public List<String> indexKeys(String indexName, String indexKey) {
    lock.lock();
    try {
      if (!this.indexers.containsKey(indexName)) {
        throw new IllegalArgumentException(String.format("index %s doesn't exist!", indexName));
      }
      Map<String, Set<String>> index = this.indices.get(indexName);
      Set<String> set = index.get(indexKey);
      List<String> keys = new ArrayList<>(set.size());
      for (String key : set) {
        keys.add(key);
      }
      return keys;
    } finally {
      lock.unlock();
    }
  }

  /**
   * By index list.
   *
   * @param indexName the index name
   * @param indexKey the index key
   * @return the list
   */
  @Override
  public List<ApiType> byIndex(String indexName, String indexKey) {
    lock.lock();
    try {
      if (!this.indexers.containsKey(indexName)) {
        throw new IllegalArgumentException(String.format("index %s doesn't exist!", indexName));
      }
      Map<String, Set<String>> index = this.indices.get(indexName);
      Set<String> set = index.get(indexKey);
      if (set == null) {
        return Arrays.asList();
      }
      List<ApiType> items = new ArrayList<>(set.size());
      for (String key : set) {
        items.add(this.items.get(key));
      }
      return items;
    } finally {
      lock.unlock();
    }
  }

  /**
   * Return the indexers registered with the cache.
   *
   * @return registered indexers
   */
  @Override
  public Map<String, Function<ApiType, List<String>>> getIndexers() {
    return indexers;
  }

  /**
   * Add additional indexers to the cache.
   *
   * @param newIndexers indexers to add
   */
  @Override
  public void addIndexers(Map<String, Function<ApiType, List<String>>> newIndexers) {
    if (!items.isEmpty()) {
      throw new IllegalStateException("cannot add indexers to a non-empty cache");
    }
    Set<String> oldKeys = indexers.keySet();
    Set<String> newKeys = newIndexers.keySet();
    Set<String> intersection = new HashSet<>(oldKeys);
    intersection.retainAll(newKeys);
    if (!intersection.isEmpty()) {
      throw new IllegalArgumentException("indexer conflict: " + intersection);
    }
    for (Map.Entry<String, Function<ApiType, List<String>>> indexEntry : newIndexers.entrySet()) {
      addIndexFunc(indexEntry.getKey(), indexEntry.getValue());
    }
  }

  /**
   * updateIndices modifies the objects location in the managed indexes, if this is an update, you
   * must provide an oldObj.
   *
   * <p>Note: updateIndices must be called from a function that already has a lock on the cache.
   *
   * @param oldObj the old obj
   * @param newObj the new obj
   * @param key the key
   */
  public void updateIndices(ApiType oldObj, ApiType newObj, String key) {
    // if we got an old object, we need to remove it before we can add
    // it again.
    if (oldObj != null) {
      deleteFromIndices(oldObj, key);
    }
    for (Map.Entry<String, Function<ApiType, List<String>>> indexEntry : indexers.entrySet()) {
      String indexName = indexEntry.getKey();
      Function<ApiType, List<String>> indexFunc = indexEntry.getValue();
      List<String> indexValues = indexFunc.apply(newObj);
      if (CollectionUtils.isEmpty(indexValues)) {
        continue;
      }

      Map<String, Set<String>> index =
          this.indices.computeIfAbsent(indexName, k -> new HashMap<>());
      for (String indexValue : indexValues) {
        Set<String> indexSet = index.computeIfAbsent(indexValue, k -> new HashSet<>());
        indexSet.add(key);
      }
    }
  }

  /**
   * deleteFromIndices removes the object from each of the managed indexes.
   *
   * <p>Note: It is intended to be called from a function that already has a lock on the cache.
   *
   * @param oldObj the old obj
   * @param key the key
   */
  private void deleteFromIndices(ApiType oldObj, String key) {
    for (Map.Entry<String, Function<ApiType, List<String>>> indexEntry : this.indexers.entrySet()) {
      Function<ApiType, List<String>> indexFunc = indexEntry.getValue();
      List<String> indexValues = indexFunc.apply(oldObj);
      if (CollectionUtils.isEmpty(indexValues)) {
        continue;
      }

      Map<String, Set<String>> index = this.indices.get(indexEntry.getKey());
      if (index == null) {
        continue;
      }
      for (String indexValue : indexValues) {
        Set<String> indexSet = index.get(indexValue);
        if (indexSet != null) {
          indexSet.remove(key);
        }
      }
    }
  }

  /**
   * Add index func.
   *
   * @param indexName the index name
   * @param indexFunc the index func
   */
  public void addIndexFunc(String indexName, Function<ApiType, List<String>> indexFunc) {
    this.indices.put(indexName, new HashMap<>());
    this.indexers.put(indexName, indexFunc);
  }

  public Function<ApiType, String> getKeyFunc() {
    return keyFunc;
  }

  public void setKeyFunc(Function<ApiType, String> keyFunc) {
    this.keyFunc = keyFunc;
  }

  /**
   * DEPRECATE: use Caches#deletionHandlingMetaNamespaceKeyFunc instead. TODO: remove after 7.0.0
   *
   * <p>deletionHandlingMetaNamespaceKeyFunc checks for DeletedFinalStateUnknown objects before
   * calling metaNamespaceKeyFunc.
   *
   * @param <ApiType> the type parameter
   * @param object specific object
   * @return the key
   */
  @Deprecated
  public static <ApiType> String deletionHandlingMetaNamespaceKeyFunc(ApiType object) {
    return Caches.deletionHandlingMetaNamespaceKeyFunc(object);
  }

  /**
   * DEPRECATE: use Caches#metaNamespaceKeyFunc instead. TODO: remove after 7.0.0
   *
   * <p>MetaNamespaceKeyFunc is a convenient default KeyFunc which knows how to make keys for API
   * objects which implement HasMetadata Interface. The key uses the format <namespace>/<name>
   * unless <namespace> is empty, then it's just <name>.
   *
   * @param obj specific object
   * @return the key
   */
  @Deprecated
  public static String metaNamespaceKeyFunc(Object obj) {
    return Caches.metaNamespaceKeyFunc(obj);
  }

  /**
   * DEPRECATE: use Caches#metaNamespaceIndexFunc instead. TODO: remove after 7.0.0
   *
   * <p>metaNamespaceIndexFunc is a default index function that indexes based on an object's
   * namespace.
   *
   * @param obj specific object
   * @return the indexed value
   */
  @Deprecated
  public static List<String> metaNamespaceIndexFunc(Object obj) {
    return Caches.metaNamespaceIndexFunc(obj);
  }
}

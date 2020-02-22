package com.jsoniter;

import com.jsoniter.annotation.JsonProperty;
import com.jsoniter.any.Any;
import com.jsoniter.fuzzy.MaybeEmptyArrayDecoder;
import com.jsoniter.fuzzy.MaybeStringLongDecoder;
import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.Decoder;
import com.jsoniter.spi.EmptyExtension;
import com.jsoniter.spi.JsoniterSpi;
import com.jsoniter.spi.TypeLiteral;
import junit.framework.TestCase;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

public class TestDemo extends TestCase {
    public void test_bind_api() throws IOException {
        JsonIterator iter = JsonIterator.parse("[0,1,2,3]");
        int[] val = iter.read(int[].class);
        System.out.println(val[3]);
    }

    public void test_any_api() throws IOException {
        JsonIterator iter = JsonIterator.parse("[0,1,2,3]");
        System.out.println(iter.readAny().toInt(3));
    }

    public void test_iterator_api() throws IOException {
        JsonIterator iter = JsonIterator.parse("[0,1,2,3]");
        int total = 0;
        while (iter.readArray()) {
            total += iter.readInt();
        }
        System.out.println(total);
    }

    public static class ABC {
        public Any a;
    }

    public void test_abc() throws IOException {
        JsonIterator iter = JsonIterator.parse("{'a': {'b': {'c': 'd'}}}".replace('\'', '"'));
        ABC abc = iter.read(ABC.class);
        assertEquals("d", abc.a.get("b", "c").object());
    }

    public void test_iterator_api_and_bind() throws IOException {
        JsonIterator iter = JsonIterator.parse("[123, {'name': 'taowen', 'tags': ['crazy', 'hacker']}]".replace('\'', '"'));
        iter.readArray();
        int userId = iter.readInt();
        iter.readArray();
        User user = iter.read(User.class);
        user.userId = userId;
        iter.readArray(); // end of array
        System.out.println(user);
    }

    public static class TestObject2 {

    }

    public void test_empty_array_as_null() throws IOException {
        JsoniterSpi.registerExtension(new EmptyExtension() {
            @Override
            public Decoder createDecoder(final String cacheKey, final Type type) {
                if (cacheKey.endsWith(".original")) {
                    // avoid infinite loop
                    return null;
                }
                if (type != TestObject2.class) {
                    return null;
                }
                return new Decoder() {
                    @Override
                    public Object decode(JsonIterator iter1) throws IOException {
                        if (iter1.whatIsNext() == ValueType.ARRAY) {
                            if (iter1.readArray()) {
                                // none empty array
                                throw iter1.reportError("decode [] as null", "only empty array is expected");
                            } else {
                                return null;
                            }
                        } else {
                            // just use original decoder
                            TypeLiteral typeLiteral = new TypeLiteral(type, cacheKey + ".original",
                                    TypeLiteral.create(type).getDecoderCacheKey());
                            return iter1.read(typeLiteral);
                        }
                    }
                };
            }
        });
        JsonIterator iter = JsonIterator.parse("[]");
        assertNull(iter.read(TestObject2.class));
    }

    public static class Order {
        @JsonProperty(decoder = MaybeStringLongDecoder.class)
        public long order_id;
        @JsonProperty(decoder = MaybeEmptyArrayDecoder.class)
        public OrderDetails order_details;
    }

    public static class OrderDetails {
        public String pay_type;
    }

    public void test_iterator() throws IOException {
        JsonIterator iter = JsonIterator.parse("{'numbers': ['1', '2', ['3', '4']]}".replace('\'', '"'));
        assertEquals("numbers", iter.readObject());
        assertTrue(iter.readArray());
        assertEquals("1", iter.readString());
        assertTrue(iter.readArray());
        assertEquals("2", iter.readString());
        assertTrue(iter.readArray());
        assertEquals(ValueType.ARRAY, iter.whatIsNext());
        assertTrue(iter.readArray()); // start inner array
        assertEquals(ValueType.STRING, iter.whatIsNext());
        assertEquals("3", iter.readString());
        assertTrue(iter.readArray());
        assertEquals("4", iter.readString());
        assertFalse(iter.readArray()); // end inner array
        assertFalse(iter.readArray()); // end outer array
        assertNull(iter.readObject()); // end object
    }

    public void test_any_is_fun() throws IOException {
        Any any = JsonIterator.deserialize("{'numbers': ['1', '2', ['3', '4']]}".replace('\'', '"'));
        any.get("numbers").asList().add(Any.wrap("hello"));
        assertEquals("{'numbers':['1', '2', ['3', '4'],'hello']}".replace('\'', '"'), JsonStream.serialize(any));
        any = JsonIterator.deserialize("{'error': 'failed'}".replace('\'', '"'));
        assertFalse(any.toBoolean("success"));
        any = JsonIterator.deserialize("{'success': true}".replace('\'', '"'));
        assertTrue(any.toBoolean("success"));
        any = JsonIterator.deserialize("{'success': 'false'}".replace('\'', '"'));
        assertFalse(any.toBoolean("success"));
        any = JsonIterator.deserialize("[{'score':100}, {'score':102}]".replace('\'', '"'));
        assertEquals("[100,102]", JsonStream.serialize(any.get('*', "score")));
        any = JsonIterator.deserialize("[{'score':100}, {'score':[102]}]".replace('\'', '"'));
        assertEquals("[{},{'score':102}]".replace('\'', '"'), JsonStream.serialize(any.get('*', '*', 0)));
        any = JsonIterator.deserialize("[{'score':100}, {'score':102}]".replace('\'', '"'));
        assertEquals(Long.class, any.get(0, "score").object().getClass());
        any = JsonIterator.deserialize("[{'score':100}, {'score':102}]".replace('\'', '"'));
        assertEquals(ValueType.INVALID, any.get(0, "score", "number").valueType());
        any = JsonIterator.deserialize("[{'score':100}, {'score':102}]".replace('\'', '"'));
        for (Any record : any) {
            Any.EntryIterator entries = record.entries();
            while (entries.next()) {
                System.out.println(entries.key());
                System.out.println(entries.value());
            }
        }
    }

    public static class TestObject {
        public String body;
        public int commentCount;
    }

    public void test_utf8() {
        String input = "{\"body\":\"یبل تیبلتیبمسش یبمک سشیمب سشیکمب تشسکمیبنمسیتبمسشتیب منشستمتبیملتیبملتیبمتلیمبلت یبلتیبل ینبنن اسی باسیش نباسشینباشسینبشسنتیب شسنیاب نشسیابنسشتیابنتسشیابنسشیابنسیشابنسشیاب نسشیاب سشیب سشیبن ت سینبسیبنسیشاب نسیاب سیاب نسیتبا سینا سیا بسیاب نستیشاب نستیبسی\",\"commentCount\":0,\"doILike\":false,\"doISuggest\":false,\"likeCount\":1,\"rowId\":\"58bf6ed1c8015f0bd4422c70\",\"specialLabel\":0,\"submitDate\":\"2017-03-08T02:39:13.568Z\",\"suggestCount\":0,\"title\":\"تست می باشد.\",\"type\":1,\"url\":[\"images/cell/490661220.jpg\"],\"username\":\"mahdihp\"}";
        TestObject obj = JsonIterator.deserialize(input, TestObject.class);
        assertEquals(0, obj.commentCount);
    }

    public void test_deserialize() {
        String str = "{\"port\":13110}  ";
        JsonIterator.deserialize(str.getBytes(), HashMap.class);
    }

    public static class CollectionResponse<T> {
        public List<T> results;
    }

    public static class Feed {
        public String id;
        public String owner;
        public String name;
    }

    public void test_generics() {
        CollectionResponse<Feed> objs = JsonIterator.deserialize("{\n" +
                "\"count\": 1,\n" +
                "\"next\": null,\n" +
                "\"previous\": null,\n" +
                "\"results\": [\n" +
                "{\n" +
                "\"id\": \"f560fccb-4020-43c1-8a27-92507ef625bd\",\n" +
                "\"search_terms\": [\n" +
                "\"gigi hadid\"\n" +
                "],\n" +
                "\"owner\": \"...\",\n" +
                "\"egress_nodes\": [\n" +
                "\"DE\"\n" +
                "],\n" +
                "\"status\": \"ACTIVE\",\n" +
                "\"expires_at\": null,\n" +
                "\"available_sources\": [\n" +
                "\"92c784ae-b7bf-4434-a6cc-740109d91cc8\"\n" +
                "],\n" +
                "\"available_egress_nodes\": [\n" +
                "\"DE\"\n" +
                "],\n" +
                "\"created_at\": \"2017-07-27T13:29:20.935108Z\",\n" +
                "\"name\": \"Test\",\n" +
                "\"description\": \"\",\n" +
                "\"start_date\": null,\n" +
                "\"end_date\": null,\n" +
                "\"match_all_include\": false,\n" +
                "\"velocity\": 0.0666666666666667,\n" +
                "\"storage_consumption\": 0.000011026778,\n" +
                "\"consumption\": 0.000120833333333333,\n" +
                "\"persistence_enabled\": true,\n" +
                "\"sources\": [\n" +
                "\"92c784ae-b7bf-4434-a6cc-740109d91cc8\"\n" +
                "],\n" +
                "\"permissions\": {\n" +
                "\"has_read_access\": true,\n" +
                "\"has_write_access\": true,\n" +
                "\"has_share_access\": true,\n" +
                "\"has_ownership\": true\n" +
                "}\n" +
                "}\n" +
                "]\n" +
                "}", new TypeLiteral<CollectionResponse<Feed>>(){});
        assertEquals("f560fccb-4020-43c1-8a27-92507ef625bd", objs.results.get(0).id);
    }
}

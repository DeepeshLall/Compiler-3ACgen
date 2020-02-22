public void testNewCompiler() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        for (int i = 1; i <= 3; i++) {
            ClassLoader classLoader = new ClassLoader() {
            };
            CachedCompiler cc = new CachedCompiler(null, null);
            Class a = cc.loadFromJava(classLoader, "A", "public class A { static int i = " + i + "; }");
            Class b = cc.loadFromJava(classLoader, "B", "public class B implements net.openhft.compiler.MyIntSupplier { public int get() { return A.i; } }");
            MyIntSupplier bi = (MyIntSupplier) b.newInstance();
            assertEquals(i, bi.get());
        }
    }
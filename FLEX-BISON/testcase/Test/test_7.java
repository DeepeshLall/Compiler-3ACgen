public void test_compiler() throws ClassNotFoundException {
        try {
            // CompilerUtils.setDebug(true);
            // added so the test passes in Maven.
            CompilerUtils.addClassPath("target/test-classes");
//        ClassLoader loader = CompilerTest.class.getClassLoader();
//        URLClassLoader urlClassLoader = new URLClassLoader(((URLClassLoader)loader).getURLs(), null);
//        Class fooBarTee1 = urlClassLoader.loadClass("eg.FooBarTee");

            // this writes the file to disk only when debugging is enabled.
            CachedCompiler cc = CompilerUtils.DEBUGGING ?
                    new CachedCompiler(new File(parent, "src/test/java"), new File(parent, "target/compiled")) :
                    CompilerUtils.CACHED_COMPILER;

            String text = "generated test " + new Date();
            cc.loadFromJava(EG_FOO_BAR_TEE, "package eg;\n" +
                    '\n' +
                    "import eg.components.BarImpl;\n" +
                    "import eg.components.TeeImpl;\n" +
                    "import eg.components.Foo;\n" +
                    '\n' +
                    "public class FooBarTee{\n" +
                    "    public final String name;\n" +
                    "    public final TeeImpl tee;\n" +
                    "    public final BarImpl bar;\n" +
                    "    public final BarImpl copy;\n" +
                    "    public final Foo foo;\n" +
                    '\n' +
                    "    public FooBarTee(String name) {\n" +
                    "        // when viewing this file, ensure it is synchronised with the copy on disk.\n" +
                    "        System.out.println(\"" + text + "\");\n" +
                    "        this.name = name;\n" +
                    '\n' +
                    "        tee = new TeeImpl(\"test\");\n" +
                    '\n' +
                    "        bar = new BarImpl(tee, 55);\n" +
                    '\n' +
                    "        copy = new BarImpl(tee, 555);\n" +
                    '\n' +
                    "        // you should see the current date here after synchronisation.\n" +
                    "        foo = new Foo(bar, copy, \"" + text + "\", 5);\n" +
                    "    }\n" +
                    '\n' +
                    "    public void start() {\n" +
                    "    }\n" +
                    '\n' +
                    "    public void stop() {\n" +
                    "    }\n" +
                    '\n' +
                    "    public void close() {\n" +
                    "        stop();\n" +
                    '\n' +
                    "    }\n" +
                    "}\n");

            // add a debug break point here and step into this method.
            FooBarTee fooBarTee = new FooBarTee("test foo bar tee");
            Foo foo = fooBarTee.foo;
            assertNotNull(foo);
            assertEquals(text, foo.s);
        } catch (Throwable t) {
            t.printStackTrace(System.out);
            fail(t.getMessage());
        }
    }
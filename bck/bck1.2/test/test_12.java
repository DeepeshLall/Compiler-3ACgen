public void test_compilerErrorsDoNotBreakNextCompilations() throws Exception {
        // quieten the compiler output
        PrintWriter quietWriter = new PrintWriter(new StringWriter());

        // cause a compiler error
        try {
            CompilerUtils.CACHED_COMPILER.loadFromJava(
                    getClass().getClassLoader(), "X", "clazz X {}", quietWriter);
            fail("Should have failed to compile");
        } catch (ClassNotFoundException e) {
            // expected
        }

        // ensure next class can be compiled and used
        Class testClass = CompilerUtils.CACHED_COMPILER.loadFromJava(
                getClass().getClassLoader(), "S", "class S {" +
                        "public static final String s = \"ok\";}");

        Callable callable = (Callable)
                CompilerUtils.CACHED_COMPILER.loadFromJava(
                        getClass().getClassLoader(), "OtherClass",
                        "import java.util.concurrent.Callable; " +
                                "public class OtherClass implements Callable<String> {" +
                                "public String call() { return S.s; }}")
                        .newInstance();

        assertEquals("S", testClass.getName());
        assertEquals("ok", callable.call());
    }
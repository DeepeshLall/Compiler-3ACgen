public void test_settingPrintStreamWithCompilerErrors() throws Exception {
        final AtomicBoolean usedSysOut = new AtomicBoolean(false);
        final AtomicBoolean usedSysErr = new AtomicBoolean(false);

        final PrintStream out = System.out;
        final PrintStream err = System.err;
        final StringWriter writer = new StringWriter();

        try {
            System.setOut(new PrintStream(new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    usedSysOut.set(true);
                }
            }));
            System.setErr(new PrintStream(new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    usedSysErr.set(true);
                }
            }));

            CompilerUtils.CACHED_COMPILER.loadFromJava(
                    getClass().getClassLoader(), "TestClass", "clazz TestClass {}",
                    new PrintWriter(writer));
            fail("Should have failed to compile");
        } catch (ClassNotFoundException e) {
            // expected
        } finally {
            System.setOut(out);
            System.setErr(err);
        }

        assertFalse(usedSysOut.get());
        assertFalse(usedSysErr.get());

        List<String> expectedInErrorFromCompiler = Arrays.asList(
                "TestClass.java:1: error", "clazz TestClass {}");

        for (String expectedError : expectedInErrorFromCompiler) {
            String errorMessage = String.format("Does not contain expected '%s' in:\n%s", expectedError, writer.toString());
            assertTrue(errorMessage, writer.toString().contains(expectedError));
        }
    }
public void test_settingPrintStreamWithNoErrors() throws Exception {
        final AtomicBoolean usedSysOut = new AtomicBoolean(false);
        final AtomicBoolean usedSysErr = new AtomicBoolean(false);

        final PrintStream out = System.out;
        final PrintStream err = System.err;
        final StringWriter writer = new StringWriter();

        try {
            System.setOut(new PrintStream(new OutputStream() {
                @Override
                public void write(int b) {
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
                    getClass().getClassLoader(), "TestClass", "class TestClass {}",
                    new PrintWriter(writer));
        } finally {
            System.setOut(out);
            System.setErr(err);
        }

        assertFalse(usedSysOut.get());
        assertFalse(usedSysErr.get());
        assertEquals("", writer.toString());
    }
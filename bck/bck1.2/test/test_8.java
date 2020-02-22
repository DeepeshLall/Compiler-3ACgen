public void test_fromFile()
            throws ClassNotFoundException, IOException, IllegalAccessException, InstantiationException,
            NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class clazz = CompilerUtils.loadFromResource("eg.FooBarTee2", "eg/FooBarTee2.jcf");
        // turn off System.out
        PrintStream out = System.out;
        try {
            System.setOut(new PrintStream(new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                }
            }));
            final Constructor stringConstructor = clazz.getConstructor(String.class);
            long start = 0;
            for (int i = -RUNS / 10; i < RUNS; i++) {
                if (i == 0) start = System.nanoTime();

                Object fooBarTee2 = stringConstructor.newInstance(getName());
                Foo foo = (Foo) clazz.getDeclaredField("foo").get(fooBarTee2);
                assertNotNull(foo);
                assertEquals("load java class from file.", foo.s);
            }
            long time = System.nanoTime() - start;
            out.printf("Build build small container %,d ns.%n", time / RUNS);
        } finally {
            System.setOut(out);
        }
    }
static final File parent;
    private static final String EG_FOO_BAR_TEE = "eg.FooBarTee";
    private static final int RUNS = 1000 * 1000;

    static {
        File parent2 = new File("essence-file");
        if (parent2.exists()) {
            parent = parent2;

        } else {
            parent = new File(".");
        }
    }
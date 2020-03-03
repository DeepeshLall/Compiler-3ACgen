package project.unittests;

class Inner1 {
    long a[];
    float b[][];

    public Inner1(int dim1, int dim2, int dim3) {
        a = new long[dim1];
        b = new float[dim2][dim3];
        initalize(dim1, dim2, dim3);
    }

    void initalize(int dim1, int dim2, int dim3) {
        for (int i = 0; i < dim1; i++) {
            a[i] = i;
        }
        for (int j = 0; j < dim2; j++) {
            for (int k = 0; k < dim3; k++) {
                b[j][k] = j + k;
            }
        }
    }
}

class Inner2 {
    int c[][] = new int[3][3];
    double d[] = new double[4];

    public Inner2(int dim1, int dim2, int dim3) {
        c = new int[dim1][dim2];
        d = new double[dim3];
        init(dim1, dim2, dim3);
    }

    void init(int dim1, int dim2, int dim3) {
        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                c[i][j] = i + j;
            }
        }

        for (int i = 0; i < dim3; i++) {
            d[i] = i;
        }
    }

}

class ArrayTypeCheck {
    public static void main(String[] args) {

        Inner1 obj1 = new Inner1(3, 4, 5);
        Inner2 obj2 = new Inner2(1, 2, 3);

        float a = obj1.b[2][2];

        int b[] = new int[2];
        b[1] = obj2.c[0][1];
        System.out.println("a: " + a + " b[0]: " + b[0] + " b[1]: " + b[1]);
    }
}

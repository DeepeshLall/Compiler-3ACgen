package project.unittests;

public class MatMul {
    public static void main(String args[]) {
        int r1 = 3, c1 = 2, r2 = 2, c2 = 3, i, j, k, sum;

        if (c1 == r2) {
            int mat1[][] = new int[r1][c1];
            int mat2[][] = new int[r2][c2];
            int res[][] = new int[r1][c2];

            for (i = 0; i < r1; i++) {
                for (j = 0; j < c1; j++)
                    mat1[i][j] = r1 + c1;
            }

            for (i = 0; i < r2; i++) {
                for (j = 0; j < c2; j++)
                    mat2[i][j] = r2 + c2;
            }

            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++) {
                    sum = 0;
                    for (k = 0; k < r2; k++) {
                        sum += mat1[i][k] * mat2[k][j];

                    }
                    res[i][j] = sum;
                }
            }

            System.out.println("Output matrix: ");
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        } else
            System.out.print("multipication is not possible!");
    }

}

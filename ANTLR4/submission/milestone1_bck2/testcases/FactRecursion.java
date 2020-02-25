package project.unittests;

public class FactRecursion {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int i = 5;
        int fact = factorial(i);
        System.out.println("Value of factorial(" + i + "): " + fact);
    }
}

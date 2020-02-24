package project.unittests;

class Inner1 {
    double a;
    long b;
}

class Inner2 {
    double c;
    long d;

    public Inner2(double c1, long d1) {
        this.c = c1;
        this.d = d1;
    }
}

public class TypeCheck2 {
    public static void main(String[] args) {
        Inner1 obj1 = new Inner1();
        Inner2 obj2 = new Inner2(3.14, 10);

        System.out.println("a: " + obj1.a + " b:" + obj1.b);
        obj1.a = obj2.c;
        obj1.b = obj2.d;
        System.out.println("a: " + obj1.a + " b:" + obj1.b);
    }
}

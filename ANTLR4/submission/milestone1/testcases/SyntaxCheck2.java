package project.unittests;

public class SyntaxCheck2 {
    int a;
    float b;
    long c;

    public SyntaxCheck2() {
    }

    public SyntaxCheck2(int val) {
        this.a = val;
    }

    public SyntaxCheck2(int val1, float val2) {
        this.a = val1;
        this.b = val2;
    }

    public SyntaxCheck2(int val1, float val2, long val3) {
        this.a = val1;
        this.b = val2;
        this.c = val3;
    }

    void printFunc(float val) {
        System.out.println(val);
    }

    void printFunc(int val) {
        System.out.println(val);
    }

    void printFunc(long val) {
        System.out.println(val);
    }

    void printFunc() {
        System.out.println("a: " + this.a + " b: " + this.b + " c: " + this.c);
    }

    public static void main(String[] args) {
        SyntaxCheck2 obj = new SyntaxCheck2(5, 3.14f);
        obj.printFunc(obj.a);
        obj.printFunc(obj.b);
        obj.printFunc(obj.c);
        obj.printFunc();
    }

}

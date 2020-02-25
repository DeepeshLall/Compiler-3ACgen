package project.unittests;

public class LexicalScope {
    final static int iVar = 42;
    float fVar;

    public LexicalScope() {
        fVar = 3.14f;
    }

    public float localFunc(int fVar) {
        int iVar = 10;
        return this.fVar + fVar + iVar;
    }

    public static void main(String[] args) {
        System.out.println("Value of static var: " + iVar);
        int iVar = 100;
        System.out.println("Local var: " + iVar);

        LexicalScope scope = new LexicalScope();
        if (LexicalScope.iVar < iVar) {
            float fVar = scope.localFunc(iVar + LexicalScope.iVar);
            System.out.println("Return from localFunc:" + fVar);
        }
    }
}

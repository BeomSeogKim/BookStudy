public class ReferenceStaticVariable {
    static String name;

    public ReferenceStaticVariable() {

    }

    public ReferenceStaticVariable(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        ReferenceStaticVariable referenceStaticVariable = new ReferenceStaticVariable();
        referenceStaticVariable.checkName();
    }

    public void checkName() {
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("Tommy");
        System.out.println(reference1.name);
        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("Chulsoon");
        System.out.println(reference1.name);    // static 변수이므로 클래스 끼리 공유한다.
    }
}
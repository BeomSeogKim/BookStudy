public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass referencePass = new ReferencePass();
//        referencePass.callPassByValue();
        referencePass.callPassByReference();
    }

    public void callPassByValue() {
        int a = 10;
        String b = "b";
        System.out.println("before passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        passByValue(a, b);
        System.out.println("after passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void passByValue(int a, String b) {
        a = 20;
        b = "z";
        System.out.println("in passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void callPassByReference() {
        MemberDTO member = new MemberDTO("Tommy");
        System.out.println("before passByReference");
        System.out.println("member.name = " + member.name);
        passByReference(member);
        System.out.println("after passByReference");
        System.out.println("member.name = " + member.name);

    }

    public void passByReference(MemberDTO member) {
        member.name = "SungChoon";
        System.out.println("in passByReference");
        System.out.println("member.name = " + member.name);
    }
}
package Chapter12;

public class Equals {
    public static void main(String[] args) {
        Equals equals = new Equals();
        equals.equalMethod();
        equals.equalMethod2();
    }

    private void equalMethod() {
        MemberDTO memberDTO1 = new MemberDTO("Tommy");
        MemberDTO memberDTO2 = new MemberDTO("Tommy");
        if (memberDTO1 == memberDTO2) {
            System.out.println("memberDTO1 and memberDTO2 is same");
        } else {
            System.out.println("memberDTO1 and memberDTO2 is not same");
        }
    }
    private void equalMethod2() {
        MemberDTO memberDTO1 = new MemberDTO("Tommy");
        MemberDTO memberDTO2 = new MemberDTO("Tommy");
        if (memberDTO1.equals(memberDTO2)) {
            System.out.println("memberDTO1 and memberDTO2 is same");
        } else {
            System.out.println("memberDTO1 and memberDTO2 is not same");
        }
    }

}

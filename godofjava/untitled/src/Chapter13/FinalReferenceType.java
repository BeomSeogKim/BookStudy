package Chapter13;

import Chapter12.MemberDTO;

public class FinalReferenceType {
    final MemberDTO memberDTO = new MemberDTO("Kim");

    public static void main(String[] args) {
        FinalReferenceType finalReferenceType = new FinalReferenceType();
        finalReferenceType.checkDTO();
    }

    private void checkDTO() {
        System.out.println(memberDTO);
//        memberDTO = new MemberDTO("Kim");
    }
}

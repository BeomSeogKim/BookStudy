public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor referenceConstructor = new ReferenceConstructor();
        referenceConstructor.makeMemberObject();
    }

    public void makeMemberObject() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Tommy");
        MemberDTO dto3 = new MemberDTO("Tommy", "010xxxxxxxx");
        MemberDTO dto4 = new MemberDTO("Tommy", "010xxxxxxxx","kbs@");
    }
}
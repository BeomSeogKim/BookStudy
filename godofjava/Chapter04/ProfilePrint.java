public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public static void main(String[] args) {
        ProfilePrint profilePrint = new ProfilePrint();
        profilePrint.setAge((byte) 23);
        profilePrint.setName("LEE SU YEON");
        profilePrint.setMarried(true);

        System.out.println(profilePrint.getName() + "님의 정보 입니다. 나이 : " + profilePrint.getAge() + " 결혼 여부 : " + profilePrint.isMarred());
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMarried(boolean flag) {
        this.isMarried = flag;
    }

    public boolean isMarred() {
        return this.isMarried;
    }

}
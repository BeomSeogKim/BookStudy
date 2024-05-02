public class ProfilePrint {

    byte age;
    String name;
    boolean isMarried;

    public void setAge(byte age) {
	this.age = age;
    }

    public byte getAge() {
	return age;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setMarried(boolean flag) {
	isMarried = flag;
    } 

    public boolean isMarried() {
	return isMarried;
    }

    public static void main(String[] args) {
	ProfilePrint profile = new ProfilePrint();
	profile.setAge( (byte) 31);
	profile.setName("tommy");
	profile.setMarried(false);
	
	System.out.println("Print Basic Infos");
	System.out.println("age = " + profile.getAge());
	System.out.println("name = " + profile.getName());
	System.out.println("married = " + profile.isMarried());
    }
}

public class Profile {
    String name;
    int age;

    public static void main(String[] args) {
		Profile profile = new Profile();
		profile.setName("Min");
		profile.setAge(20);
		profile.printName();
		profile.printAge();
	}

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printName() {
        System.out.println("name = " + this.name);
    }

	public void printAge() {
		System.out.println("age = " + this.age);
	}


}

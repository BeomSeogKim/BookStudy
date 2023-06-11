package Chapter10;

public class ChildOverriding extends ParentOverriding {

    public ChildOverriding() {
        System.out.println("ChildOverriding.ChildOverriding");
    }

    public void printName() {
        System.out.println("ChildOverriding printName()");
    }
}

package Chapter12;

public class ToString {
    public static void main(String[] args) {
        ToString toString = new ToString();
        toString.toStringMethod(toString);
        toString.toStringMethod2(toString);
    }

    @Override
    public String toString() {
        return "ToString class";
    }

    public void toStringMethod(Object obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus " + obj);
    }

    public void toStringMethod2(Object obj) {
        System.out.println(this);
        System.out.println(toString());
        System.out.println("plus " + this);
    }
}

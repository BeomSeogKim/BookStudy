public class OperatorIncrement {
    public static void main(String[] args) {
        OperatorIncrement operatorIncrement = new OperatorIncrement();
        operatorIncrement.increment();
        System.out.println("-----------");
        operatorIncrement.increment2();
    }

    public void increment() {
        int intValue = 1;
        System.out.println(intValue++);
        System.out.println(intValue);
        System.out.println(++intValue);
    }

    public void increment2() {
        int intValue = 1;
        System.out.println(intValue);
        intValue = intValue + 1;
        System.out.println(intValue);
        intValue = intValue + 1;
        System.out.println(intValue);
    }
}
public class OperatorComound {
    public static void main(String[] args) {
        OperatorComound operatorComound = new OperatorComound();
        operatorComound.compound();
    }
    public void compound() {
        int intValue = 10;
        System.out.println("intValue = " + (intValue += 5));
        System.out.println("intValue = " + (intValue -= 5));
        System.out.println("intValue = " + (intValue *= 5));
        System.out.println("intValue = " + (intValue /= 5));
        System.out.println("intValue = " + (intValue %= 5));
    }
}
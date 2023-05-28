public class OperatorUnary {
    public static void main(String[] args) {
        OperatorUnary operatorUnary = new OperatorUnary();
        operatorUnary.unary();
    }

    public void unary() {
        int intValue = -10;
        int result = +intValue;
        System.out.println("result = " + result);
        result = -intValue;
        System.out.println("result = " + result);
    }
}
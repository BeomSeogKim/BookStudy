public class OperatorPlusMinus {
    public static void main(String[] args) {
        OperatorPlusMinus operatorPlusMinus = new OperatorPlusMinus();
        operatorPlusMinus.additive();
    }
    public void additive() {
        int intValue1 = 5;
        int intValue2 = 15;
        int result = intValue1 + intValue2;
        System.out.println("result = " + result);
        result = intValue2 - intValue1;
        System.out.println("result = " + result);
    }
}
public class OperatorMultipleDivision {
    public static void main(String[] args) {
        OperatorMultipleDivision operatorMultipleDivision = new OperatorMultipleDivision();
        operatorMultipleDivision.multipleDivision();
        operatorMultipleDivision.devideInt();
        operatorMultipleDivision.devideInt2();

    }

    public void multipleDivision() {
        int intValue1 = 5;
        int intValue2 = 10;
        int result = intValue1 * intValue2;
        System.out.println("result = " + result);
        result = intValue2 / intValue1;
        System.out.println("result = " + result);
    }

    public void devideInt() {
        int intValue1 = 5;
        int intValue2 = 10;
        int result = intValue1 / intValue2;
        System.out.println("result = " + result);
    }

    public void devideInt2() {
        double intValue1 = 5;
        double intValue2 = 10;
        double result = intValue1 / intValue2;
        System.out.println("result = " + result);
    }
}
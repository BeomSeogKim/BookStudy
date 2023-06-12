package Chapter14;

public class ExceptionVariable {
    public static void main(String[] args) {
        ExceptionVariable sample = new ExceptionVariable();
        sample.checkVariable3();
    }

    private void checkVariable() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        }
        System.out.println("This code must run");
    }
//    private void checkVariable2() {
//        try {
//            int[] intArray = new int[5];
//            System.out.println(intArray[5]);
//        } catch (Exception e) {
//            System.out.println(intArray.length);
//        }
//        System.out.println("This code must run");
//    }

    private void checkVariable3() {
        int[] intArray = null;
        try {
            intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        }
        System.out.println("This code must run");
    }
}

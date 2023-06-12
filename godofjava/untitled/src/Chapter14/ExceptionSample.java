package Chapter14;

public class ExceptionSample {
    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        sample.arrayOutOfBoundsTryCatch();
    }

    private void arrayOutOfBounds() {
        int[] intArray = new int[5];
        System.out.println(intArray[5]);
    }

    private void arrayOutOfBoundsTryCatch() {
        try {
            int[] intArray = new int[5];
            System.out.println(intArray[5]);
            System.out.println("This code should run");
        } catch (Exception e) {
            System.out.println("Exception occurred.");
        }
        System.out.println("This code must run.");

    }
}

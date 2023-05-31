public class MethodVarags {
    public static void main(String[] args) {
        MethodVarags methodVarags = new MethodVarags();
        methodVarags.calculateNumbersWithArray(new int[]{1, 2, 3, 4, 5});
        methodVarags.calculateNumbers(1, 2, 3, 4, 5);
    }

    public void calculateNumbersWithArray(int[] numbers) {

    }

    public void calculateNumbers(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Total = " + total);
    }
}
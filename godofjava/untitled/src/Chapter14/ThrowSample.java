package Chapter14;

public class ThrowSample {
    public static void main(String[] args) {
        ThrowSample sample = new ThrowSample();
        sample.throwException(13);
    }

    private void throwException(int number) {
        try {
            if (number > 12) {
                throw new Exception("Number is over than 12");
            }
            System.out.println("Number is " + number);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

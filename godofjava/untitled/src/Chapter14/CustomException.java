package Chapter14;

public class CustomException {
    public static void main(String[] args) {
        CustomException sample = new CustomException();
        try {
            sample.throwMyException(13);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    private void throwMyException(int i) throws MyException{
        if (i > 12) {
            throw new MyException("Number is over than 12");
        }
    }
}

package Chapter15;

public class StringSample {
    public static void main(String[] args) {
        StringSample stringSample = new StringSample();
        stringSample.convert();
        stringSample.convertUTF16();
    }

    private void convert() {
        try {
            String korean = "한글";

            byte[] array1 = korean.getBytes();
            printByteArray(array1);
            String korean2 = new String(array1);
            System.out.println(korean2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void convertUTF16() {
        try {
            String korean = "자바의 신 최고 !!!";
            byte[] array1 = korean.getBytes("UTF-16");
            printByteArray(array1);
            String korean2 = new String(array1, "UTF-16");
            System.out.println(korean2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void printByteArray(byte[] array) {
        for (byte data : array) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
}

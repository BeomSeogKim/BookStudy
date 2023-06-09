package Chapter15;

public class StringCompareTo {
    public static void main(String[] args) {
        StringCompareTo sample = new StringCompareTo();
        sample.checkString();
        sample.checkCompare();
        sample.checkCompareTo();
    }

    public void checkString() {
        String text = "You must know String class.";
        System.out.println("text.length() = " + text.length());
        System.out.println("text.isEmpty() = " + text.isEmpty());
    }

    public void checkCompare() {
        String text = "Check Value";
//        String text2 = "Check Value";
        String text2 = new String("Check Value");
        String text3 = "check value";
        if (text == text2) {
            System.out.println("text==text2 result is same");
        } else {
            System.out.println("text==text2 result is different");
        }

        if (text.equals(text2)) {
            System.out.println("text.equals(text2) result is same");
        }

        if (text.equalsIgnoreCase(text3)) {
            System.out.println("text.equalsIgnoreCase(text3) result is same");
        }
    }

    public void checkCompareTo() {
        String text = "a";
        String text2 = "b";
        String text3 = "c";
        System.out.println(text2.compareTo(text));
        System.out.println(text2.compareTo(text3));
        System.out.println(text.compareTo(text3));

    }
}

public class ControlIfAndOr {

    public static void main(String[] args) {
        ControlIfAndOr control = new ControlIfAndOr();
        control.ifAndOr();
        control.tripleIfandOr();
    }

    public void ifAndOr() {
        int age = 25;
        boolean isMarried = true;

        if (age > 25 && isMarried) {
            System.out.println("Age is over 25 and Married");
        }

        if (age > 25 || isMarried) {
            System.out.println("Age is over 25 or Married");
        }
    }

    public void tripleIfandOr() {
        int age = 25;
        boolean isMarried = true;
        double height = 180;

        if ((age > 25 || isMarried) && height >= 180) {
            System.out.println("Age is over 25 or Married and height is over 180");
        }
    }

    public void elseIf(int point) {
        if (point > 90) {
            System.out.println("A");
        } else if (point > 80) {
            System.out.println("B");
        } else if (point > 70) {
            System.out.println("C");
        } else if (point > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
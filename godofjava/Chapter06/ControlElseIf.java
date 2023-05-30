public class ControlElseIf {
    public static void main(String[] args) {
        ControlElseIf controlElseIf = new ControlElseIf();
        controlElseIf.elseIf(85);
    }

    public void elseIf(int point) {
        if (point > 90) {   // 90점 초과
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
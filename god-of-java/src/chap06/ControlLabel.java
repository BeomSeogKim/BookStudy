public class ControlLabel {

    public static void main(String[] args) {
        ControlLabel control = new ControlLabel();
        control.printTimesTable();
        control.printTimesTableSkipAfter4Case2();
    }

    // 구구단 출력 method
    public void printTimesTable() {
        for (int i = 1; i <= 9; i++) {
            if (i == 4) continue;
            for (int j = 1; j <= 9; j++) {
                if (j == 4) break;
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }
    }

    // 구구단 출력 method
    public void printTimesTableSkipAfter4Case2() {
        startLabel:
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 4) continue startLabel;
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }
    }

}
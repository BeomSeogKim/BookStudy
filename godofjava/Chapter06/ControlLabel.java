public class ControlLabel {
    public static void main(String[] args) {
        ControlLabel controlLabel = new ControlLabel();
        controlLabel.printTimesTable();
        controlLabel.printTimesTableSkip4Case2();
        controlLabel.printTimesTableSkipAfter4Case1();
    }

    public void printTimesTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j < 9; j++) {
                System.out.print(i + " * " + j +" = " + i*j + " ");
            }
            System.out.println();
        }
    }

    public void printTimesTableSkip4Case2() {
        for (int i = 1; i <= 9; i++) {
            if (i == 4) continue;
            for (int j = 1; j < 9; j++) {
                if (j == 4) {
                    continue;
                }
                System.out.print(i + " * " + j +" = " + i*j + " ");
            }
            System.out.println();
        }
    }

    public void printTimesTableSkipAfter4Case1() {
        for (int i = 1; i <= 9; i++) {
            if (i == 4) continue;
            for (int j = 1; j < 9; j++) {
                if (j == 4) break;
                System.out.print(i + " * " + j +" = " + i*j + " ");
            }
            System.out.println();
        }
    }
}
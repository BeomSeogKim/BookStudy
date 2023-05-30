public class ManageHeight {
    int[][] gradeHeights;
    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        for (int i = 0; i < 5; i++) {
            System.out.println("Class No. : " + (i + 1));
//            manageHeight.printHeight(i);
            manageHeight.printAverage(i);
        }
    }

    public void setData() {
        gradeHeights = new int[][]{
                {170, 180, 173, 175, 177},
                {160, 165, 167, 186},
                {158, 177, 187, 176},
                {173, 182, 181},
                {170, 180, 165, 177, 172}
        };
    }

    public void printHeight(int classNo) {
        for (int height : gradeHeights[classNo]) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo) {
        double average = 0.0;
        double numberOfStudents = 0;
        double sum = 0;
        for (int height : gradeHeights[classNo]) {
            numberOfStudents++;
            sum += height;
        }
        average = sum / numberOfStudents;
        System.out.println("Height averge : " + average);
    }
}
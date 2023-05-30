public class ArrayInitialize {

    static String[] month = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December"};

    public static void main(String[] args) {
        ArrayInitialize arrayInitialize = new ArrayInitialize();
        arrayInitialize.otherInit();
        System.out.println(arrayInitialize.getMonth(2));
    }

    public void otherInit() {
        int[] lottoNumbers = {5, 12, 23, 25, 38, 41, 2};
    }

    public String getMonth(int monthInt) {
        return month[monthInt - 1];
    }
}
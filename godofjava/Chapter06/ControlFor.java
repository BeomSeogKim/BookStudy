public class ControlFor {
    public static void main(String[] args) {
        ControlFor controlFor = new ControlFor();
        controlFor.forLoop(10);
    }

    public void forLoop(int until) {
        int sum = 0;
        for (int loop = 0; loop <= until; loop++) {
            sum += loop;
        }
        System.out.println("1 to " + until + "=" + sum);
    }
}
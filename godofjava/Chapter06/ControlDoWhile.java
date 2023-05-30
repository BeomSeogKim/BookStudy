public class ControlDoWhile {
    public static void main(String[] args) {
        ControlDoWhile controlDoWhile = new ControlDoWhile();
        controlDoWhile.doWhile();
    }

    public void doWhile() {
        ControlSwitch controlSwitch = new ControlSwitch();
        int loop = 0;
        do {
            loop++;
            controlSwitch.switchCalendar(loop);
        } while (loop < 12);
    }
}
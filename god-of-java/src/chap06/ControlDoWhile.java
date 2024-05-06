public class ControlDoWhile {
    public static void main(String[] args) {
        ControlDoWhile control = new ControlDoWhile();
        control.doWhile();
    }

    public void doWhile(){
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        do {
            loop++;
            control.switchCalendar(loop);
        } while (loop < 12);
    }
}
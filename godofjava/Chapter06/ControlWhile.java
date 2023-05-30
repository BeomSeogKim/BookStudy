public class ControlWhile {
    public static void main(String[] args) {
        ControlWhile controlWhile = new ControlWhile();
        controlWhile.whileLoop1();
        System.out.println("--------------");
        controlWhile.whileBreak();
        System.out.println("--------------");
        controlWhile.whileContinue();
    }

    public void whileLoop1() {
        ControlSwitch controlSwitch = new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            controlSwitch.switchCalendar(loop);
        }
    }

    public void whileBreak() {
        ControlSwitch controlSwitch = new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            controlSwitch.switchCalendar(loop);
            if (loop == 6) break;
        }
    }

    public void whileContinue() {
        ControlSwitch controlSwitch = new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            if (loop == 6) continue;
            controlSwitch.switchCalendar(loop);
        }
    }
}
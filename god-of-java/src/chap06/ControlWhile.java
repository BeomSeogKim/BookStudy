public class ControlWhile {
    public static void main(String[] args) {
        ControlWhile control = new ControlWhile();
        control.whileLoop1();
        control.whileLoop2();
        control.whileBreak();
        control.whileContinue();
    }

    public void whileLoop1() {
        System.out.println("ControlWhile.whileLoop1");
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
        }
    }

    public void whileLoop2() {
        System.out.println("ControlWhile.whileLoop2");
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        while (loop < 6) {
            loop++;
            control.switchCalendar(loop);
        }
    }

    public void whileBreak() {
        System.out.println("ControlWhile.whileBreak");
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
            if (loop == 6) {
                break;
            }
        }
    }

    public void whileContinue() {
        System.out.println("ControlWhile.whileContinue");
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            if (loop == 6) continue;
            control.switchCalendar(loop);
        }
    }

}
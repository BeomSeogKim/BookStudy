public class ControlSwitch {
    public static void main(String[] args) {
        ControlSwitch controlSwitch = new ControlSwitch();
        controlSwitch.switchStatement(1);
        controlSwitch.switchStatement(2);
        controlSwitch.switchStatement(3);
        controlSwitch.switchStatement(4);
        controlSwitch.switchStatement(6);
        System.out.println("------");
        controlSwitch.switchStatement2(1);
    }

    public void switchStatement(int numberOfWheel) {
        switch (numberOfWheel) {
            case 1:
                System.out.println(numberOfWheel + ": It is one foot bicycle");
                break;
            case 2:
                System.out.println(numberOfWheel + ": It is a motor cycle or bicycle");
                break;
            case 3:
                System.out.println(numberOfWheel + ": It is a three wheel car");
                break;
            case 4:
                System.out.println(numberOfWheel + ": It is a car.");
                break;
            default:
                System.out.println(numberOfWheel + ": It is an expensive car");
                break;
        }
    }
    public void switchStatement2(int numberOfWheel) {
        switch (numberOfWheel) {
            case 1:
                System.out.println(numberOfWheel + ": It is one foot bicycle");
//                break;
            case 2:
                System.out.println(numberOfWheel + ": It is a motor cycle or bicycle");
//                break;
            case 3:
                System.out.println(numberOfWheel + ": It is a three wheel car");
                break;
            case 4:
                System.out.println(numberOfWheel + ": It is a car.");
                break;
            default:
                System.out.println(numberOfWheel + ": It is an expensive car");
                break;
        }
    }

    public void switchCalendar(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + " has 31 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + " has 30 days");
                break;
            case 2:
                System.out.println(month + " has 28 or 29 days");
                break;
            default:
                System.out.println(month + " is not a month");
                break;
        }
    }
}
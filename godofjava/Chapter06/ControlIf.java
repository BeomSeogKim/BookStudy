public class ControlIf {
    public static void main(String[] args) {
        ControlIf controlIf = new ControlIf();
        controlIf.ifStatement();
    }
    public void ifStatement() {
        if (true);
        if (true) System.out.println("It's true");
        if (true)
            System.out.println("It's also true");
        if (false) System.out.println("It's false");
    }
}
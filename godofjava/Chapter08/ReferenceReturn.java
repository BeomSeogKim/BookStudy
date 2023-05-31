public class ReferenceReturn {
    public static void main(String[] args) {
        ReferenceReturn reference = new ReferenceReturn();
        System.out.println(reference.intReturn());
        System.out.println(reference.intArrayReturn());
        System.out.println(reference.stringReturn());
    }

    public int intReturn() {
        return 0;
    }

    public int[] intArrayReturn() {
        return new int[10];
    }

    public String stringReturn() {
        return "Return Value";
    }
}
public class PrimitiveTypes{
    public static void main(String[] args) {
        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        primitiveTypes.checkByte();
        primitiveTypes.checkOtherTypes();
        primitiveTypes.checkChar();
        primitiveTypes.checkBoolean();
    }
    public void checkByte() {
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);
        byteMin = (byte) (byteMin - 1);
        byteMax = (byte) (byteMax + 1);
        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);
    }
    public void checkOtherTypes() {
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        System.out.println("shortMax + 1= " + (short) (shortMax + 1));
        System.out.println("intMax + 1 = " + (int) (intMax + 1));
        System.out.println("longMax + 1 = " + (long) (longMax + 1));
    }
    public void checkChar() {
        char charMin = '\u0000';
        char charMax = '\uffff';
        int a = 'a';
        System.out.println("charMin = [" + charMin + "]");
        System.out.println("charMax = [" + charMax + "]");
        System.out.println("intValue = [" + a + "]");
    }
    public void checkBoolean() {
        boolean flag = true;
        System.out.println("flag = " + flag);
        flag = false;
        System.out.println("flag = " + flag);
    }
}
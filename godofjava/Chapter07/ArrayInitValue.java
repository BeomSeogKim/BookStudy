public class ArrayInitValue {
    public static void main(String[] args) {
        ArrayInitValue arrayInitValue = new ArrayInitValue();
        arrayInitValue.primitiveTypes();
        arrayInitValue.referenceTypes();
        arrayInitValue.referenceTypesSetValue();
    }

    public void primitiveTypes() {
        byte[] bytes = new byte[1];
        short[] shorts = new short[1];
        int[] ints = new int[1];
        long[] longs = new long[1];
        float[] floats = new float[1];
        double[] doubles = new double[1];
        char[] chars = new char[1];
        boolean[] booleans = new boolean[1];
        System.out.println("bytes = " + bytes[0]);
        System.out.println("shorts = " + shorts[0]);
        System.out.println("ints = " + ints[0]);
        System.out.println("longs = " + longs[0]);
        System.out.println("floats = " + floats[0]);
        System.out.println("doubles = " + doubles[0]);
        System.out.println("chars = " + chars[0]);
        System.out.println("booleans = " + booleans[0]);
    }

    public void referenceTypes() {
        String[] strings = new String[2];
        ArrayInitValue[] arrayInitValues = new ArrayInitValue[2];
        System.out.println("strings = " + strings[0]);
        System.out.println("arrayInitValues = " + arrayInitValues[0]);
    }

    public void referenceTypesSetValue() {
        String[] strings = new String[2];
        ArrayInitValue[] arrayInitValues = new ArrayInitValue[2];
        strings[0] = "Please visit www.GodOfJava.com";
        arrayInitValues[0] = new ArrayInitValue();
        System.out.println("strings[0] = " + strings[0]);
        System.out.println("strings[1] = " + strings[1]);
        System.out.println("arrayInitValues[0] = " + arrayInitValues[0]);
        System.out.println("arrayInitValues[1] = " + arrayInitValues[1]);
    }
}
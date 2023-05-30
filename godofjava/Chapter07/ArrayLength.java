public class ArrayLength {
    public static void main(String[] args) {
        ArrayLength arrayLength = new ArrayLength();
        arrayLength.printArrayLength();
        arrayLength.printArray();
    }

    public void printArrayLength() {
        int[] oneDim = new int[3];
        int[][] twoDim = new int[4][2];
        System.out.println(oneDim.length);
        System.out.println(twoDim.length);
    }
    public void printArray() {
        int[][] twoDim = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("twoDim.length = " + twoDim.length);
        System.out.println("twoDim[0].length = " + twoDim[0].length);
        int twoDimLength = twoDim.length;
        for (int i = 0; i < twoDimLength; i++) {
            int twoDimOneLength = twoDim[i].length;
            for (int j = 0; j < twoDimOneLength; j++) {
                System.out.println("twoDim[" + i + "][" + j + "]= " + twoDim[i][j]);
            }
        }
    }
}
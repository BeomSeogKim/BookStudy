public class OperatorConditionalTriple {

    public static void main(String[] args) {
        OperatorConditionalTriple operatorConditionalTriple = new OperatorConditionalTriple();
        operatorConditionalTriple.doBlindDate(30);
        operatorConditionalTriple.doBlindDate(80);
    }

    public boolean doBlindDate(int point) {
        boolean doBlindDateFlag = false;
        doBlindDateFlag = (point >= 80) ? true : false;
        System.out.println(point + " : " + doBlindDateFlag);
        return doBlindDateFlag;
    }
}
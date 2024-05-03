public class OperatorPlusMinus {

    public static void main(String[] args){
	OperatorPlusMinus sample = new OperatorPlusMinus();
	sample.additive();
	sample.multipleDivision();
	sample.remainder();
	sample.compound();
    }

    public void additive() {
	int intValue1 = 5;
	int intValue2 = 10;
	int result = intValue1 + intValue2;
	System.out.println(result);
	result = intValue2 - intValue1;
	System.out.println(result);
    } 

    public void multipleDivision() {
	int intValue1 = 5;
	int intValue2 = 10;

	int result = intValue1 * intValue2;
	System.out.println(result);
 	result = intValue2 / intValue1;
	System.out.println(result);
    } 

    public void remainder() {
	int intValue1 = 53; 
	int intValue2 = 10;
	int result = intValue1 % intValue2;
	System.out.println(result);
    }

    public void compound() {
	int intValue = 10;
	intValue += 5;
	System.out.println(intValue);
	intValue -= 5; 
	System.out.println(intValue);
	intValue *= 5;
	System.out.println(intValue);
	intValue /= 5;
	System.out.println(intValue);
    } 
}

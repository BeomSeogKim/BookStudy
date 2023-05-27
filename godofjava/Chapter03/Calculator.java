public class Calculator{
	public static void main(String[] args){
		System.out.println("This is Calculator");
		Calculator calculator = new Calculator();
		int a = 10;
		int b = 5;
		System.out.println(calculator.add(a, b));
		System.out.println(calculator.subtract(a, b));
		System.out.println(calculator.multiply(a, b));
		System.out.println(calculator.divide(a, b));
	}

	public int add(int a, int b){
	    return a + b;
	}
	public int subtract(int a, int b){
	    return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public int divide(int a, int b){
        return a / b;
    }
}

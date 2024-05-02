public class Calculator {

    public static void main(String[] args) {
        System.out.println("Calculator class started");
        Calculator cal = new Calculator();
	int a = 10;
	int b = 5; 
	System.out.println("add = " + cal.add(a, b));
	System.out.println("substract = " + cal.substract(a, b));
	System.out.println("multiply = " + cal.multiply(a, b));
	System.out.println("divide = " + cal.divide(a,b));
    }

    public int add (int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
	return a / b;
    }

}

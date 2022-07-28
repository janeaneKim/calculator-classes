
public class Calculator {
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public double divide(int num1, int num2) {
		//casting as a double in case division leads to decimals
		double x = (double)num1/num2;
		return x;
	}
	
	public int square(int num1) {
		return num1 * num1;
	}
	
	//checking if calculator works
	public static void main(String[]args) {
		Calculator basicMath = new Calculator();
		System.out.println(" 2 + 3 is " + basicMath.add(2,3));
		System.out.println(" 2 - 3 is " + basicMath.subtract(2,3));
		System.out.println(" 2 * 3 is " + basicMath.multiply(2,3));
		System.out.println(" 2 / 3 is " + basicMath.divide(2,3));
		System.out.println(" 3 squared is " + basicMath.square(3));
	}

}

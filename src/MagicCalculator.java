
public class MagicCalculator extends Calculator {
	
	public double squareRoot(int num) {
		return Math.sqrt(num);
	}
	
	public double findSin(double num) {
		return Math.sin(num);
	}
	
	public double findCos(double num) {
		return Math.cos(num);
	}
	
	public double findTan(double num) {
		return Math.tan(num);
	}
	
	public int factorial(int num) {
		int factorialOutput = 1;
		for (int i = 1; i <= num; ++i) {
			factorialOutput = factorialOutput * i;
		}
		return factorialOutput;
	}
	
	
	public static void main(String[] args) {
		// Checking for inherited methods
		MagicCalculator complexMath = new MagicCalculator();
		System.out.println(" 2 + 3 is " + complexMath.add(2,3));
		System.out.println(" 2 - 3 is " + complexMath.subtract(2,3));
		System.out.println(" 2 * 3 is " + complexMath.multiply(2,3));
		System.out.println(" 2 / 3 is " + complexMath.divide(2,3));
		System.out.println(" 3 squared is " + complexMath.square(3));
		
		//checking magicCalculator methods
		System.out.println(" Square root of 9 is " + complexMath.squareRoot(9));
		System.out.println(" The sine of 90 degrees is " + complexMath.findSin(Math.toRadians(90)));
		System.out.println(" The cosine of 90 degrees is " + complexMath.findCos(Math.toRadians(90)));
		System.out.println(" The tangent of 90 degrees is " + complexMath.findTan(Math.toRadians(90)));
		System.out.println(" The factorial of of 7 is " + complexMath.factorial(7));



	}

}

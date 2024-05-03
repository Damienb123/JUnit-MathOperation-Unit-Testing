

/**
 * Main class to demonstrate the usage of MathOperation class.
 */
public class Main {

	/**
	 * Entry point of the program.
	 * Initialize a MathOperation object and calculates the factorial of 5.
	 * @param args
	 */
	
	public static void main(String[] args) {
		MathOperation mathOperation = new MathOperation(); //Initialize the MathOperation object
		int factorialofFive = mathOperation.factorial(5); //Calculate the factorial of 5
		System.out.println("Factorial of 5 is: " + factorialofFive); //Print the result
	}

}

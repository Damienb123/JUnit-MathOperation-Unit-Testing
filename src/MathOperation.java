
/**
 * class call for math operations
 * getting data from operations and string outputs
 * from given methods to return something
 * 
 */

public class MathOperation {
	
	
	/**
	 * initialized variables for a, b, number to complete all branches
	 * within the methods
	 */
	int a = 5;
	int b = 50;
	int number = 54;
	
	int c = 44;
	int d = 3;
	
	/**
	 * addition is completed with int values initialized with a and b
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a, int b) { //add method
		return a + b;
	}
	
	public int subtract(int a, int b) { //subtract method
		return a - b;
	}
	
	private int multiply(int a, int b) { //multiplication method
		return a * b;
	}
	
	/**
	 * to properly return value if positive or negative,
	 * number is set to 54 to define that
	 * @param number
	 * @return
	 * 
	 * prior to testing, 50 is positive so it will return true
	 * 50 is not a negative number so it is false
	 */
	
	public Boolean isPositive(int number) { //is the value positive method
		if(number > 0) {
			return true; //number is positive
		}
		return false; //number is not positive
	}
	
	public boolean isNegative(int number) { //is the value negative method
		if(number < 0) {
			return true; //number is negative
		}
		return false; //number is negative
	}
	
	
	
	public String getMessage() { //string method and return getter message
		return "This is a test";
	}
	
	public int[] getArray() { //method getting a length of array and its indexes
		return new int[] {24, 54, 90}; //in this case 24 54 90 are the indexes
	}
	
	public String getNewMessage() {
		return new String("This is the test 2 string message"); //connecting String to the new provided message
	}
	
	
	public int factorial(int n) { //factorial method
		if(n == 0 || n == 1) {
			return 1;
		} else {
			
			return multiply(n, factorial(subtract(n, 1))); //recursively call the factorial method
		}
	}
	
	
	
	
	/**
	 * before testing a throw exception is expected implicitly handling the 
	 * division operation instead of the arithmetic exception itself
	 * 
	 * commented lines are the errors
	 */
	
	public void throwArithmeticException() {
		int result; //initializes the result to get an int value
		try {
			result = 1 / 0; //attempts the division operation
		} catch (ArithmeticException e) {
		throw new ArithmeticException("Division by zero is not allowed"); //handles the needed exception to not allow division by zero 
		}	
		System.out.println(result);
	}
	
	
}
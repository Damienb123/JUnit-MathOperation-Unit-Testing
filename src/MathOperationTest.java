
/**
 * Unit testing for the MathOperation class:
 * 
 * Code coverage:
 * 
 *  - 81.1%
 *  - 163 instructions covered
 *  - 38 missed instructions
 *  - 201 total instructions
 *  
 *  the number of total test cases: 11
 *  
 *  Each method represents a single test case.
 *  
 */

/**
 * 
 * importing the Junit Assert
 * and annotations
 * 
 */

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;


/**
 * Unit testing class for the MathOperation class.
 * The purpose is to utilize JUnit's assertion methods.
 * 
 */
public class MathOperationTest {
	
	private static MathOperation mathOperation;
	
	
	@BeforeClass
	public static void setupBeforeClass() throws Exception {
		mathOperation = new MathOperation();
	}
	
	 @Test
	    public void testFactorialZero() {
	        assertEquals(1, mathOperation.factorial(0)); // Factorial of 0 should be 1
	    }

	    @Test
	    public void testFactorialPositiveNumber() {
	        assertEquals(120, mathOperation.factorial(5)); // Factorial of 5 should be 120
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testFactorialNegativeNumber() {
	        // Factorial of a negative number should throw IllegalArgumentException
	        mathOperation.factorial(-5);
	    }

	/**
	 * each method represents a unit to verify behavior
	 * of MathOperation methods.
	 * 
	 */
	@Test
	public void testAdd() {
		assertEquals(15, mathOperation.add(10, 5)); //Adding 5 and 10 should result in 15
	}

	@Test
	public void testSubtract() { 
		assertEquals(-5, mathOperation.subtract(5, 10)); //Subtracting 10 from 5 should result in -5
	}

	@Test
	public void testIsPositive() {
		assertTrue(mathOperation.isPositive(50)); //50 is a postive number
	}

	@Test
	public void testIsNegative() {
		assertTrue(mathOperation.isNegative(-50)); //-50 is a negative number
	}

	
	@Test
	public void testGetMessage() {
		assertNotEquals("This is a a test", mathOperation.getMessage()); //Message should not match the expected value
	}

	@Test
	public void testGetArray() {
		int[] expectedArray = {24, 54, 90};
		assertArrayEquals(expectedArray, mathOperation.getArray()); //Array should match the expected values
	}

	@Test
	public void testGetNewMessage() {
		assertNotEquals("This is a message", mathOperation.getNewMessage()); //New message should not match the expected value
	}
	
	/**
	 * Testing exception handling for arithmetic operations.
	 */

	@Test(expected = ArithmeticException.class) 
	public void testThrowArithmeticException() { 
		mathOperation.throwArithmeticException(); //Expects an ArithmeticException to be thrown
		
		
	}

}

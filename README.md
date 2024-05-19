# JUnit-MathOperation-Unit-Testing

## Table of Contents
1. [Overview](#Overview) 
2. [MathOperation Class](#MathOperation-Class)
    - Methods
3. [Main Class](#Math-Class)
4. [Unit Testing with JUnit](#Unit-Testing-with-JUnit)
    - Test Methods
5. [Setup Instructions](#Setup-Instructions)
6. [Example Usage](#Example-Usage)
    - Running the Main Program
    - Running the Tests
7. [Code Coverage](#Code-Coverage)
8. [Conclusion](#Conclusion)

## Overview

This project demonstrates the use of JUnit for unit testing a MathOperation class in Java. The MathOperation class provides basic mathematical operations and includes methods for addition, subtraction, factorial calculation, and checking if a number is positive or negative. The Main class demonstrates the usage of the MathOperation class by calculating the factorial of 5. The unit tests cover various scenarios to ensure the correctness of the methods in the MathOperation class.

## MathOperation Class

The MathOperation class contains several methods for performing basic mathematical operations and checking certain properties of numbers.

### Methods

- add(int a, int b): Adds two integers and returns the result.
- subtract(int a, int b): Subtracts the second integer from the first and returns the result.
- multiply(int a, int b): Multiplies two integers and returns the result (private method).
- isPositive(int number): Checks if a number is positive and returns a Boolean result.
- isNegative(int number): Checks if a number is negative and returns a Boolean result.
- getMessage(): Returns a test message.
- getArray(): Returns an array of integers.
- getNewMessage(): Returns a new test message.
- factorial(int n): Calculates the factorial of a given number recursively.
- throwArithmeticException(): Demonstrates exception handling by attempting to divide by zero and throwing an ArithmeticException.

## Main Class
The Main class demonstrates the usage of the MathOperation class by calculating the factorial of 5 and printing the result.
```
public class Main {

    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        int factorialofFive = mathOperation.factorial(5);
        System.out.println("Factorial of 5 is: " + factorialofFive);
    }
}
```

## Unit Testing with JUnit

The MathOperationTest class contains unit tests for the MathOperation class using JUnit. The tests cover various scenarios to ensure the correctness of the methods.

### Test Methods

- testFactorialZero(): Tests the factorial of 0.
- testFactorialPositiveNumber(): Tests the factorial of a positive number.
- testFactorialNegativeNumber(): Tests the factorial of a negative number (expected to throw -- IllegalArgumentException).
- testAdd(): Tests the addition method.
- testSubtract(): Tests the subtraction method.
- testIsPositive(): Tests the isPositive method.
- testIsNegative(): Tests the isNegative method.
- testGetMessage(): Tests the getMessage method.
- testGetArray(): Tests the getArray method.
- testGetNewMessage(): Tests the getNewMessage method.
-testThrowArithmeticException(): Tests the throwArithmeticException method (expected to throw ArithmeticException).


## Setup Instructions

- Clone the Repository: Clone the project repository to your local machine.

- Import the Project: Open your preferred IDE (e.g., IntelliJ IDEA, Eclipse) and import the project as a Maven project.

- Add JUnit Dependency: Ensure that the JUnit dependency is included in your pom.xml file:
```
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

## Example Usage

### Running the Main Program
To run the main program and see the factorial calculation of 5:

- Locate the Main class.

- Run the Main class as a Java application.

- The output should be:
```
Factorial of 5 is: 120
```

### Running the Tests
To run the unit tests:

- Locate the MathOperationTest class.
- Run the tests using your IDE's JUnit test runner.
- All tests should pass successfully.

## Code Coverage
The unit tests achieve a code coverage of 81.1%, covering 163 out of 201 instructions. This indicates a high level of confidence in the correctness of the MathOperation methods.

## Conclusion
This project demonstrates the usage of JUnit for unit testing a MathOperation class in Java. The tests cover various scenarios to ensure the correctness of the mathematical operations. The project also includes a main program to demonstrate the usage of the MathOperation class. By following the setup instructions, you can run the tests and verify the correctness of the implementation.

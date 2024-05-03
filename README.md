# JUnit-MathOperation-Unit-Testing
This project aims to demonstrate unit testing using JUnit for the MathOperation class. The MathOperation class provides basic arithmetic operations and utility methods.

Project Overview

The MathOperation class contains the following methods:

    add(int a, int b): Adds two integers a and b.
    subtract(int a, int b): Subtracts integer b from integer a.
    isPositive(int number): Checks if the given number is positive.
    isNegative(int number): Checks if the given number is negative.
    factorial(int n): Calculates the factorial of a non-negative integer n.
    getMessage(): Returns a test message.
    getArray(): Returns an array of integers.
    getNewMessage(): Returns a new test message.
    throwArithmeticException(): Throws an ArithmeticException by dividing by zero.

Unit Tests

Unit tests are implemented using JUnit to ensure the correctness of the MathOperation class methods. The MathOperationTest class contains test methods for each method in the MathOperation class.
Test Cases

    testFactorialZero(): Tests the factorial method with input zero.
    testFactorialPositiveNumber(): Tests the factorial method with a positive number.
    testFactorialNegativeNumber(): Tests the factorial method with a negative number (expects an IllegalArgumentException).
    testAdd(): Tests the add method.
    testSubtract(): Tests the subtract method.
    testIsPositive(): Tests the isPositive method.
    testIsNegative(): Tests the isNegative method.
    testGetMessage(): Tests the getMessage method.
    testGetArray(): Tests the getArray method.
    testGetNewMessage(): Tests the getNewMessage method.
    testThrowArithmeticException(): Tests exception handling in the throwArithmeticException method (expects an ArithmeticException).

Code Coverage

The project aims for high code coverage to ensure thorough testing of the MathOperation class. Currently, the project has achieved 81.1% code coverage, covering 163 out of 201 total instructions.
Running the Tests

To run the unit tests, ensure that JUnit is properly configured in your development environment. Then, execute the MathOperationTest class as a JUnit test.

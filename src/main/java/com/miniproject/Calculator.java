package com.miniproject;

/**
 * Calculator utility class for basic mathematical operations
 */
public class Calculator {
    
    /**
     * Performs calculation based on the given operation
     * @param num1 First number
     * @param num2 Second number
     * @param operation The operation to perform (+, -, *, /)
     * @return The result of the calculation
     * @throws IllegalArgumentException if operation is invalid or division by zero
     */
    public double calculate(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return subtract(num1, num2);
            case '*':
                return multiply(num1, num2);
            case '/':
                return divide(num1, num2);
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
    
    private double add(double a, double b) {
        return a + b;
    }
    
    private double subtract(double a, double b) {
        return a - b;
    }
    
    private double multiply(double a, double b) {
        return a * b;
    }
    
    private double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }
}
package com.miniproject;

import java.util.Scanner;

/**
 * Main class for the Mini Java Project
 * A simple calculator application with basic operations
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Welcome to Mini Java Calculator ===");
        
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double result = calculator.calculate(num1, num2, operation);
            System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operation, num2, result);
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
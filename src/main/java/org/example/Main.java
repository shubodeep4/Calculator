package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Operation operation = new Operation();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("Enter a simple arithmetic expression (e.g., 2 + 3 * 4):");
        String expression = scanner.nextLine();

        try {
            double result = operation.evaluateExpression(expression);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid expression: " + e.getMessage());
        }

    }
}
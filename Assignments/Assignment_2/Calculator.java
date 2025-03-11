/*Q22: Implement a calculator that takes two numbers and an operator (+, -, *, /) as input and prints the result using only switch-case.*/

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = Scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = Scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = Scanner.nextDouble();
        
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        
        System.out.println("Result: " + result);
        Scanner.close();
    }
}

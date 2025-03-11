//Q5: Write a Java program to swap two numbers using the += and -= operators only.

import java.util.Scanner;

public class SwapNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        
        a += b; 
        b = a - b; 
        a -= b; 
        
        System.out.println("After swapping:");
        System.out.println("First number (a): " + a);
        System.out.println("Second number (b): " + b);
    sc.close();
	}
}

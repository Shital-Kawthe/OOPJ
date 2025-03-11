/*Q20: Implement a Java program that returns the absolute value of a given number using the ternary operator (without using Math.abs()).*/

import java.util.Scanner;

public class AbsoluteValue1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int absValue = (num < 0) ? -num : num;   
        System.out.println("Absolute value: " + absValue);
     
	}
}

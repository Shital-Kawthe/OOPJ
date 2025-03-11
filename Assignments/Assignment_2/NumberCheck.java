/*Q16: Write a program that determines whether a given number is positive, negative, or zero using only the ternary operator.*/

import java.util.Scanner;

public class NumberCheck{
    public static void main(String args[]){
	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println("The number is: " + result);
		
	}
}

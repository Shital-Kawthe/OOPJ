/*Q8: Write a program that takes three boolean inputs and prints true if at least two of them are true.
Hint: Use logical operators (&&, ||).*/

import java.util.Scanner;

public class BooleanIP {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first boolean value (true/false): ");
       
	   boolean a = sc.nextBoolean();
        System.out.print("Enter second boolean value (true/false): ");
        
		boolean b = sc.nextBoolean();
        System.out.print("Enter third boolean value (true/false): ");
       
	   boolean c = sc.nextBoolean();
        boolean result = (a && b) || (b && c) || (a && c);

        System.out.println("At least two values are true: " + result);
        sc.close();
    }
}

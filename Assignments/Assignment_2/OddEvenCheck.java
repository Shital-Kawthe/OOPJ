/*Q23: Given a number, find whether it is odd or even using the & bitwise operator and print the result without using if-else.*/

import java.util.Scanner;

public class OddEvenCheck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.println((num & 1) == 0 ? "Even" : "Odd");
        
        scanner.close();
    }
}

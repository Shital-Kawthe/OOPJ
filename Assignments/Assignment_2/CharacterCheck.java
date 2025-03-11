/*Q19: Write a Java program that checks whether a character is uppercase, lowercase, or not a letter using only the ternary operator.*/

import java.util.Scanner;

public class CharacterCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase Letter" :
                        (ch >= 'a' && ch <= 'z') ? "Lowercase Letter" :
                        "Not a Letter";
        System.out.println("The character is: " + result);
    
	}
}

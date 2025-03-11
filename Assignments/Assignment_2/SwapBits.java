/*Q15: Implement a program to swap odd and even bits of a number using bitwise operators.
Hint: Use masks: (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1.*/

import java.util.Scanner;

public class SwapBits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
       
        int swapped = ((n & 0xAAAAAAAA) >> 1) | ((n & 0x55555555) << 1);
        System.out.println("Swapped number: " + swapped);
   }
}

/*Q3:  Implement a program that calculates the  sum of digits  of an integer using  modulus 
(  %  ) and division (  /  ) operators.*/

import java.util.Scanner;
public class SumOfDigits{
    public static void main(String args[]){
	  Scanner scanner= new Scanner(System.in);
	  System.out.print("Enter an Integer: ");
	  int num = scanner.nextInt();
	  scanner.close();
	  
	  int sum = 0;
	  while (num != 0){
	    sum += num % 10;
		num /= 10;
      }
	   System.out.println("Sum of digits: " + sum);
      
	}
}

/*Q1:  Write a program to swap two numbers  without using a third variable  and without 
using arithmetic operators like  +  or  - .*/

public class Swap {
    public static void main(String[] args) {
        int x = 20;
        int y = 30;

        System.out.println("Before swap: x = " + x + ", y = " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}

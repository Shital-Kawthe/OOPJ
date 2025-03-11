//11. Write a program to check if a number is positive and even using logical operators (&&, ||, !).


public class AssignmentOperators {
    public static void main(String[] args) {
        int num = 10;
        // Using Logical AND (&&)
        if (num > 0 && num % 2 == 0) {

            System.out.println(num + " is positive and even using &&.");
        }

        // Using Logical OR (||)
        if (num > 0 || num % 2 == 0) {

            System.out.println(num + " is positive or even using ||.");
        }

        // Using Logical NOT (!)

        if (!(num <= 0 || num % 2 != 0)) {
            System.out.println(num + " is positive and even using !.");
        }
    }
}






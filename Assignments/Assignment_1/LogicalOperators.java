//10. Write a program to compare two integers using all relational operators (==, !=, >, <, >=, <=) and display the results.

public class LogicalOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("AND: " + ((num1 > 5) && (num2 < 25)));
        System.out.println("OR: " + ((num1 > 5) || (num2 < 15)));
        System.out.println("NOT: " + !(num1 > 5));
    }
}




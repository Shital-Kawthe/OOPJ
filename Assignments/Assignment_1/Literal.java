//5. Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.

public class Literal {
    public static void main(String[] args) {
        // Binary literal
        int binaryLiteral = 0b0110;
        System.out.println("Binary Literal: " + binaryLiteral);

        // Octal literal
        int octalLiteral = 015;
        System.out.println("Octal Literal: " + octalLiteral);

        // Hexadecimal literal
        int hexLiteral = 0xB;
        System.out.println("Hexadecimal Literal: " + hexLiteral);

        // Floating-point literal
        double floatLiteral = 20.5;
        System.out.println("Floating-point Literal: " + floatLiteral);
    }
}


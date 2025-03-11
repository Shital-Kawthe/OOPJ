//12. Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.

public class AssignOperators {
   public static void main(String[] args) {
     int a = 10;
     int b = 2;

     System.out.println("Initial values: a = " + a + ", b = " + b);

        a = b;
		System.out.println("a = b: a = " + a);
        a += b;
		System.out.println("a += b: a = " + a);
        a -= b;
		System.out.println("a -= b: a = " + a);
        a *= b; 
		System.out.println("a *= b: a = " + a);
        a /= b;
		System.out.println("a /= b: a = " + a);
        a %= b; 
		System.out.println("a %= b: a = " + a);
  }
}

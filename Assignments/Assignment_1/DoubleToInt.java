public class DoubleToInt {
public static void main(String args[]){
 
  double doubleValue = 20.5;
  int intValue = (int) doubleValue; //Typecasting
 
   System.out.println("Double Value: " + doubleValue);
   System.out.println("Int Value: " + intValue);
   System.out.println("Data loss: " + (doubleValue - intValue));// data loss explaination
 
  }
}
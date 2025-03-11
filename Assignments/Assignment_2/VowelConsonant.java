/*Q10: Write a program to determine if a character is a vowel or a consonant using the ternary operator.*/

public class VowelConsonant {
	public static void main(String[] args){
		char x = 'a';
		x = 'm';
		check(x);
		x = 'I';
		check(x);
		x = 'V';
		check(x);
	}
	
	public static void check(char a){
		char ch = Character.toLowerCase(a);
		String str = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch =='u')? a + " is a vowel." : a + " is a consonant";  
		System.out.println(str);
	} 
}
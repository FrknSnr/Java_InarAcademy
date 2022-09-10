package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter");
		String l = input.next().toLowerCase();
		char ch = l.charAt(0);
		
		if(ch >= 'a' && ch <= 'z' ) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u' ) 
			System.out.println("The letter is a vowel");
		
		else System.out.println("The letter is a consonant");
		}
		else System.out.println(l + " is an invalid input");
		
	}

}

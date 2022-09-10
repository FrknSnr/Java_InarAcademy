package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter grade A, B, C, D or F");
		String s = input.next().toUpperCase();
		char ch = s.charAt(0);

		if (ch == 'A') 
			System.out.println("The value is 4");
		
		if (ch == 'B') 
			System.out.println("The value is 3");
		
		if (ch == 'C') 
			System.out.println("The value is 2");
		
		if (ch == 'D') 
			System.out.println("The value is 1");
		
		if (ch == 'F') 
			System.out.println("The value is 0");
		else
			System.out.println("Invalid input");
	
	
	}

}

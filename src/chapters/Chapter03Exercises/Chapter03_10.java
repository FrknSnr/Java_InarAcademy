package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_10 {

	public static void main(String[] args) {

		
		
			Scanner input = new Scanner(System.in);
			int digit1 = (int) (Math.random() * 100);
			int digit2 = (int) (Math.random() * 100);

			System.out.print("What is " + digit1 + " + " + digit2+ "? ");

			int answer = input.nextInt();

			if (digit1 + digit2 == answer) {
				System.out.println("True !");
			} else {
				System.out.println("False !");
				System.out.println(digit1 + " + " + digit2 + " should be " + (digit1 + digit2 ));
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

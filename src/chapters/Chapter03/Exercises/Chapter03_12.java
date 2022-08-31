package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a three digit number");
		
		int number = input.nextInt();
		
		if (number % 10 == number / 100)System.out.println(number + " is a palindrome"); 
		else System.out.println(number + " is not a palindrome");	
		
		
		
		
		
		
		
	}

}

package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Social Security number in the format \nDDD-DD-DDDD, where D is a digit");
		String number = input.next();

		if (number.charAt(3) != '-' && number.charAt(6) != '-')
			System.out.println(number + " is an invalid number");

		else System.out.println(number+ " is a valid number");

	}

}

package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String iban = input.nextLine();
		
		char digit1 = iban.charAt(0);
		char digit2 = iban.charAt(1);
		char digit3 = iban.charAt(2);
		char digit4 = iban.charAt(3);
		char digit5 = iban.charAt(4);
		char digit6 = iban.charAt(5);
		char digit7 = iban.charAt(6);
		char digit8 = iban.charAt(7);
		char digit9 = iban.charAt(8);
		
		int checksum = ((digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7
				+ digit8 * 8 + digit9 * 9) % 11);
		
		if (checksum == 10) {
			System.out.println("The ISBN-10 number is " + digit1 + "" + digit2 + "" + digit3 + "" + digit4 + "" + digit5
					+ "" + digit6 + "" + digit7 + "" + digit7 + "" + digit8 + "" + digit9 + "" + "X");
		} else {
			System.out.println("The ISBN-10 number is " + digit1 + "" + digit2 + "" + digit3 + "" + digit4 + "" + digit5
					+ "" + digit6 + "" + digit7 + "" + digit7 + "" + digit8 + "" + digit9 + "" + ((char)checksum));
		}
		
		
		
		
	}

}

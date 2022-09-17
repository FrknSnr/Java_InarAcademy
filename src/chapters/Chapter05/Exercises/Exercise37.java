package chapters.Chapter05.Exercises;

import java.util.Scanner;

public class Exercise37 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal integer :");
		int decimal = input.nextInt();
		int count = 0;
		int remainder = 0;

		for (int divisor = 2; divisor <= decimal / 2; divisor++) {
			if (decimal % divisor != 0) {
				remainder = decimal % divisor ;
				System.out.print(remainder + " ");

				
			}

		}

	}

}

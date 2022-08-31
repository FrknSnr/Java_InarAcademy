package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_15 {

	public static void main(String[] args) {

		int lottery = (int) (Math.random() * 900 + 100);
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a three-digit number ");
		int number = input.nextInt();

		int numberDigit1 = number % 100 % 10;
		int numberDigit2 = number % 100 / 10;
		int numberDigit3 = number / 100;

		int lotteryDigit1 = lottery % 100 % 10;
		int lotteryDigit2 = lottery % 100 / 10;
		int lotteryDigit3 = lottery / 100;

		if (number < 100 || number > 999)
			System.out.println("Please enter a 3-digit number ");
		else if (number == lottery)
			System.out.println("You won 10.000 dollars ! Congrats !");

		else if ((lotteryDigit1== numberDigit1 || lotteryDigit1 == numberDigit2 || lotteryDigit1 == numberDigit3)
				&& (lotteryDigit2 == numberDigit1 || lotteryDigit2 == numberDigit2 || lotteryDigit2 == numberDigit3)
				&& (lotteryDigit3 == numberDigit1 || lotteryDigit3 == numberDigit2 || lotteryDigit3 == numberDigit3)
				&& (numberDigit1 + numberDigit2 + numberDigit3 == lotteryDigit1 + lotteryDigit2 + lotteryDigit3))
			System.out.println("All digits match ! You won 3.000 dollars !");

		else if (numberDigit1 == lotteryDigit1 || numberDigit1 == lotteryDigit2 || numberDigit1 == lotteryDigit3
				|| numberDigit2 == lotteryDigit1 || numberDigit2 == lotteryDigit2 || numberDigit2 == lotteryDigit3
				|| numberDigit3 == lotteryDigit1 || numberDigit3 == lotteryDigit2 || numberDigit3 == lotteryDigit3)
			System.out.println("You won 1.000!");
		else System.out.println("You couldn't get anything. :(");

	}
}

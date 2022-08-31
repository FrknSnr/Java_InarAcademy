package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the exchange rate from dollars to RMB");
		double rate = input.nextDouble();

		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa");
		double number = input.nextDouble();

		System.out.println("Enter the amount of money");
		double money = input.nextDouble();
	
		if (number != 0 && number != 1)
			System.out.println("Adam gibi oku şu açıklamaları");

		if (number == 0) {
			double yuan = money * rate;
			System.out.println("You have " + money + " dollars " + " or " + yuan + " yuan.");
		}
		if (number == 1) {
			double dollars = money / rate;
			System.out.println("You have " + dollars + " dollars.");

		}

	}

}

package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount in double, for example : 12.35 ");

		double money = input.nextDouble();

		int Remaining = (int) (money * 100);

		int oneDollars = Remaining / 100;
		Remaining %= 100;

		int numberOfQuarters = Remaining / 25;
		Remaining %= 25;

		int numberOfDimes = Remaining / 10;
		Remaining %= 10;

		int numberOfNickels = Remaining / 5;
		Remaining %= 5;

		int numberOfPennies = Remaining;

		System.out.println(money + " consist of ");
		System.out.println(" " +oneDollars + ((oneDollars > 1) ? " dollars" : " dollar"));
		System.out.println(" " +numberOfQuarters + ((numberOfQuarters > 1) ? " quarters" : " quarter"));
		System.out.println(" " +numberOfDimes + ((numberOfDimes > 1) ? " Dimes" : " Dime"));
		System.out.println(" " +numberOfNickels + ((numberOfNickels > 1) ? " Nickels" : " Nickel"));
		System.out.println(" " +numberOfPennies + ((numberOfPennies > 1) ? " Pennies" : " Pennie"));

	}

}

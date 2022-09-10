package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount, for example 11.56: ");
		String money = input.nextLine();

		String Dollars = money.substring(0, money.indexOf('.'));

		int cents = Integer.parseInt(money.substring(money.indexOf('.') + 1));

		int Quarters = cents / 25;
		cents %= 25;

		int Dimes = cents / 10;
		cents %= 10;

		int Nickels = cents / 5;
		cents %= 5;

		System.out.println("Your amount " + money + " consists of\n " + Dollars + " dollars\n "
				+ Quarters + " quarters\n " + Dimes + " dimes\n " + Nickels + " nickels\n "
				+ cents + " pennies\n ");

	}

}

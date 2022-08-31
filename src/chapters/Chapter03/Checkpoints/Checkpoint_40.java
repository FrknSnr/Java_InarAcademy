package chapters.Chapter03.Checkpoints;

import java.util.Scanner;

public class Checkpoint_40 {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();

		boolean result = ((x > 0 && x < 10) == ((x > 0) && (x < 10)));
		System.out.println(result);

		boolean result2 = ((x > 0 || x < 10) == ((x > 0) || (x < 10)));
		System.out.println(result2);

		System.out.println("Enter another one");
		double y = input.nextDouble();
		boolean result3 = ((x > 0 || x < 10 && y < 0) == (x > 0 || (x < 10 && y < 0)));
		System.out.println(result3);

	}

}

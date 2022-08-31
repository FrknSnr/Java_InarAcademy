package chapters.Chapter03.Checkpoints;

import java.util.Scanner;

public class Checkpoint_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number");
		double number = input.nextDouble();

		if (number % 2 == 0) 
		System.out.println(number + " is even.");
		System.out.println(number + " is odd.");
		
		if (number % 2 == 0) 
			 System.out.println(number + " is even.");
			else
			 System.out.println(number + " is odd.");
		
	}

}

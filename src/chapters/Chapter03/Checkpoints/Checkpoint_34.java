package chapters.Chapter03.Checkpoints;

import java.util.Scanner;

public class Checkpoint_34 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = input.nextInt();
		
		System.out.println((age >= 16) ? "Ticket price is 20 dollars" :"Ticket price is 10"  );
		
	}

}

package chapters.Chapter03.Checkpoints;

import java.util.Scanner;

public class Checkpoint_25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = input.nextInt();
		
		boolean show = age > 13 && age < 18 ;
		System.out.println(show);
		
		
		
	}

}

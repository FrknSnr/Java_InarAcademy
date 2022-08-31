package chapters.Chapter03.Checkpoints;

import java.util.Scanner;

public class Checkpoint_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		boolean newLine = number % 10 == 0 ;
		System.out.println(newLine);
		
		
		
	}

}

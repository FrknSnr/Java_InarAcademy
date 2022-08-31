package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Heads(0) or tails(1) ? ");
		int number = input.nextInt();
		
		int pc = (int)(Math.random() * 2 ) ;
		
		if(number > 1 || number < 0)System.out.println("You entered wrong number");
		
		else if(number == pc)
			System.out.println("Correct");

		else if(number<pc || number > pc )System.out.println("Incorrect");
		
		
		
		
	}

}

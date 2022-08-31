package chapters.Chapter03.Checkpoints;

import java.util.Scanner;

public class Checkpoint_06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the score");
		double score = input.nextInt();
		if (score > 90) {
			score =(score * 0.03 + score);
			System.out.println(score);
		}
		if (score <= 90) { 
				score = score*0.01 + score;
		System.out.println(score);		}
		
	}

}

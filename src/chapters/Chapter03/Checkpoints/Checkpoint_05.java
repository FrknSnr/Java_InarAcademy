package chapters.Chapter03.Checkpoints;

import java.util.Scanner;

public class Checkpoint_05 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the score");
		int score = input.nextInt();
		if (score > 90) {
			score = (int) ((score * 0.03) + score);
			System.out.println(score);
		}

		else
			System.out.println(score);

	}

}

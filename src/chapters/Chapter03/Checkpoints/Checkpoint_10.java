package chapters.Chapter03.Checkpoints;

import java.util.Scanner;

public class Checkpoint_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double score = input.nextDouble();
		
		if (score >= 60.0 && score < 70)
			System.out.println("D");
		else if (score >= 70.0 && score < 80)
			System.out.println("C");
		else if (score >= 80.0 && score < 90)
			System.out.println("B");
		else if (score >= 90.0)
			System.out.println("A");
		else
			System.out.println("F");

	}

}

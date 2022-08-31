package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 0, 1 or 2 " + "( " +
		"Scissor=0, rock=1 and paper=2"+ " )");

		int player = input.nextInt();

		int pc = (int) (Math.random() * 3);


		if (pc == 0) {
			System.out.println("The computer is scissors and you are");
			if (player == 0)
				System.out.println("scissors. It is draw ");
			if (player == 1)
				System.out.println("rock. You win");
			if (player == 2)
				System.out.println("paper.You lost !");
		} else if (pc == 1) {
			System.out.println("The pc is rock and you are");
			if (player == 0)
				System.out.println(" scissors. You lost");
			if (player == 1)
				System.out.println(" rock. It is draw");
			if (player == 2)
				System.out.println(" paper. You win");
		} else {
			System.out.println("The pc is paper and you are");
			if (player == 0)
				System.out.println("scissors.You win");
			if (player == 1)
				System.out.println("rock. You lost");
			if (player == 2)
				System.out.println("paper. It is draw");
		}

	}

}

package chapters.Chapter03.Checkpoints;

public class Checkpoint_16 {

	public static void main(String[] args) {

		// a. How do you generate a random integer i such that 0 … i 6 20?
		int a = (int) (Math.random() * 20);
		// b. How do you generate a random integer i such that 10 … i 6 20?
		int b = (int) (Math.random() * 10 + 10);
		// c. How do you generate a random integer i such that 10 … i … 50?
		int c = (int) (Math.random() * 41 + 10);
		// d. Write an expression that returns 0 or 1 randomly.
		int d = (int) (Math.random() * 2);

		System.out.println(a + " " + b + " " + c + " " + d);

	}

}

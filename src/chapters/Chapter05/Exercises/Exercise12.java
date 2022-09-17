package chapters.Chapter05.Exercises;

public class Exercise12 {

	public static void main(String[] args) {

		int n = 0;

		while (Math.pow(n, 2) < 12000) {
			n++;

		}
		System.out.println("The " + n + " is the smallest integer such that n * n > 12,000 ");

	}

}

package chapters.Chapter05.Exercises;

public class Exercise33 {

	public static void main(String[] args) {


		for (int i = 6; i < 10000; i++) {
			int sum = 0;
			for (int k = 1; k <= (i / 2); k++) {
				if (i % k == 0) {
					sum += k;
				}
			}
			if (sum == i)
				System.out.println(i + " is a perfect number");

		}
	}
}

package chapters.Chapter05.Exercises;

public class ExerciseTest {

	public static void main(String[] args) {

		System.out.print("Four perfect numbers less than 10,000 are : ");
		for (int i = 6 ; i < 10000; i++) {
			int count = 0;
			for (int k = 1; k <= i / 2 ; k++) {
				if (i % k == 0) {
					count += k;
				}
			}
			if (i == count) {
				System.out.print(i + " ");

			}
		}
	}
}

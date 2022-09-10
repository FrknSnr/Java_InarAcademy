package chapters.Chapter04.Exercises;

public class Exercise06 {

	public static void main(String[] args) {

		double x1 = (int) (Math.random() * 81 - 40);
		double y1 = (int) (Math.random() * 81 - 40);
		double x2 = (int) (Math.random() * 81 - 40);
		double y2 = (int) (Math.random() * 81 - 40);
		double x3 = (int) (Math.random() * 81 - 40);
		double y3 = (int) (Math.random() * 81 - 40);

		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
		System.out.println("The three angles are " + Math.round(A * 100) / 100.0 + " " + Math.round(B * 100) / 100.0
				+ " " + Math.round(C * 100) / 100.0);
		System.out.println("The sum of the angles is : " +( A + B + C));

	}

}

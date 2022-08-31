package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three points for a triangle : ");

		double x = input.nextDouble();
		double y = input.nextDouble();
		double xII = input.nextDouble();
		double yII = input.nextDouble();
		double xIII = input.nextDouble();
		double yIII = input.nextDouble();
		
		double s1 = Math.pow(Math.pow(x - xII, 2) + Math.pow(y - yII, 2), 0.5);
		double s2 = Math.pow(Math.pow(x - xIII, 2) + Math.pow(y - yIII, 2), 0.5);
		double s3 = Math.pow(Math.pow(xII - xIII, 2) + Math.pow(yII - yIII, 2), 0.5);
		double s = (s1 + s2 + s3) / 2 ;
		
		double area = Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);
		System.out.println("The area of the triangle is " + area);
	
	}

}

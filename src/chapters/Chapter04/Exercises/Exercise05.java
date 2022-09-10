package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of the sides and their length of a regular polygon");
		double n = input.nextDouble();
		double s = input.nextDouble();
		
		double area = (n * Math.pow(s, 2)) / ( 4 * Math.tan(Math.PI / n));
		System.out.println("The area of this regular polygon is :" + area);

	
	
	
	
	
	
	}

}

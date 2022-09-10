package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a side of a hexogen");
		double side = input.nextDouble();
		
		
		double area = (6 * Math.pow(side, 2 ) ) / (4 * Math.tan(Math.PI / 6)) ;
		System.out.println("The area of this hexagon is : "+ Math.round(area*100) / 100.0);
		
		
		
		
		
		
		
		
	}

}

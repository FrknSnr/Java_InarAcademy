package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first point in degrees");
		double FirstPx = input.nextDouble();
		double FirstPy = input.nextDouble();
		
		System.out.println("Enter the second one in degrees");
		double SecondPx = input.nextDouble();
		double SecondPy = input.nextDouble();
	
		double Dist =  6371.01 * Math.acos(Math.sin(Math.toRadians(FirstPx))*Math.sin(Math.toRadians(SecondPx)) + Math.cos(Math.toRadians(FirstPx)) * Math.cos(Math.toRadians(SecondPx))* Math.cos(Math.toRadians(FirstPy - SecondPy)) ) ;
	System.out.println("The distance between the two points is " + Dist);
	}

}

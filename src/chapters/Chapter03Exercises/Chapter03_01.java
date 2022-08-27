package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a");
		double a = input.nextDouble();

		System.out.println("Enter b");
		double b = input.nextDouble();
		
		System.out.println("Enter c");
		double c = input.nextDouble();
		
		double disc = b * b - ( 4 * a * c ) ;
		double r = ( -b + ( Math.pow(( b * b ) - 4 * a * c , 0.5 ))) / 2 * a ;
		double rII = ( -b - ( Math.pow(( b * b ) - 4 * a * c , 0.5 ))) / 2 * a ;
		
		if (disc < 0 ) {
			System.out.println("There is no real root");
		}
		if (disc > 0) {
			System.out.println("RootI : " + r +  " RootII : " + rII ) ;
		}else System.out.println("The root is : " + r );
	}

}

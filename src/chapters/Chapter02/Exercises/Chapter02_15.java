package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x1 and y1 :");
		System.out.println("Enter x2 and y2 : ");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		double xI = input.nextDouble();
		double yI = input.nextDouble();
		double a = (( xI - x ) * ( xI - x )) + (( yI - y ) * ( yI - y )) ;
		double distance = Math.pow(a, 0.5);
		
		System.out.println("The distance between the two points is :" + distance );
	}
}

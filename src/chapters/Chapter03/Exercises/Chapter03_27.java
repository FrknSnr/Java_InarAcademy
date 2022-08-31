package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a coordinate with x and y");
		double coorX = input.nextDouble();
		double coorY = input.nextDouble();
		
		if(coorX <= 200.0 && coorY <= 100 )
			System.out.println("The point is in the triangle");
		else System.out.println("The point is not in the triangle");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

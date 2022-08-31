package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the side : ");
		
		double side = input.nextDouble();
		
		double area = ( Math.pow(3, 0.5) * 3 ) / 2 * side * side ;
		
		System.out.println("The area of the hexagon is : " + area );
		
	
	}

}

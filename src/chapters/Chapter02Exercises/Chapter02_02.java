package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_02 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Enter the radius and then the length");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = radius * radius * 3.14159;
		double volume = area * length ;
		System.out.println("The area is : " + area + " and the volume is : " + volume);
		
				
		;
		
	}

}

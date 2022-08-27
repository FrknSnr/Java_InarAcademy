package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_04 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number in pounds");
	
	double pound = input.nextDouble();
	
	double kilogram = pound * 0.454 ;
	 
	System.out.println(kilogram);
	
		
		
	}

}

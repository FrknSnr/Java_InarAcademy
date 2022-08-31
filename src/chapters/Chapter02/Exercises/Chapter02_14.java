package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your weight in pounds and then type your height in inches :");

		double weight = input.nextDouble();
		
		double height = input.nextDouble();
		
		double kg = weight * 0.45359237 ;
		
		double m = height * 0.0254 ;
		
		double BMI = kg / ( m * m ) ;
		
		System.out.println("Your BMI is : " + BMI );
		
	}

}

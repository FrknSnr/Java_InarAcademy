package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the pounds ");
		double pound = input.nextDouble();
		
		System.out.println("Enter the feet");
		double feet = input.nextDouble();
		
		System.out.println("Enter the inches");
		double inches = input.nextDouble();
		
		double kg = pound * 0.45359237;
		double meterF = feet * 0.3048;
		double meterI = inches * 0.0254;
		double meterTotal = meterF + meterI;
	
		double bmi = kg / ( meterTotal * meterTotal );
		System.out.println("The BMI is : " + bmi);
		if (bmi < 18.5 ) System.out.println("Underweight");
		else if (bmi < 25 ) System.out.println("Normal"); 
		else if (bmi > 30 ) System.out.println("Overweight");
		else System.out.println("Warning! Obese");
		
		
	}

}

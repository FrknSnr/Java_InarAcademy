package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the weight of the package");
		
		double weight = input.nextDouble();
		
		if (weight <= 1) System.out.println("The cost is 3.5 dollars");
		else if (weight <= 3 )System.out.println("The cost is 5.5 dollars");
		else if (weight <=10)System.out.println("The cost is 8.5 dollars");
		else if (weight <=20)System.out.println("The cost is 10.5 dollars");
		
		
	
	
	
	
	}

}

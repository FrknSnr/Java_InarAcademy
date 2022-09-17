package chapters.Chapter05.Exercises;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers. The program ends with the input 0. ");

		int sum = 0;
		int numberNegatives = 0;
		int numberPositives = 0;
		int number = input.nextInt();
		int numbers = 0;
		double average = (double) (sum / numbers);
		
		while (number != 0) {
				/*	 if (number == 0) {
				System.out.println("No numbers are entered except 0 ");
				break; } */
			
			if (number < 0) {
				numberNegatives++;
			}
			if (number > 0) {
				numberPositives++;
			}
			sum += number;
			number = input.nextInt();
			numbers++;
			
		}
		
		System.out.println("The sum of the numbers is " + sum);
		System.out.println("Total integers :" + numbers);
		System.out.println("The average is " + average);
		System.out.printf("The sum is %d ", sum);
		System.out.println("The number of negative integers is :" + numberNegatives);
		System.out.println("The number of positive integers is :" + numberPositives);

	}

}

package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the balance and the interest rate :");
		
		double balance = input.nextDouble();
		double interestR = input.nextDouble();
		
		double interest = balance * ( interestR / 1200 ) ;
		
		System.out.println("The interest is : " + interest );
		
		
	}

}

package chapters.Chapter02Exercises;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Chapter02_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Enter the saving amount : ");

		double number = input.nextDouble();
		
		double firstMonth = number * ( 1 + 0.00417 ) ; 
		
		double secondMonth = number + firstMonth * ( 1 + 0.00417 );
		
		double thirdMonth = number + secondMonth * ( 1 + 0.00417 );
		
		double fourthMonth = number +  thirdMonth * ( 1 + 0.00417 );
		
		double fifthMonth = number + fourthMonth + ( 1 + 0.00417 ) ;
		
		double sixthMonth = number + fifthMonth + ( 1 + 0.00417 ) ;
		
		System.out.println( "After six months, your account will be " + sixthMonth );
	}

}

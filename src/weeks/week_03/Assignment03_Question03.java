package weeks.week_03;

import java.util.Scanner;

public class Assignment03_Question03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-digit number ");
		int number = input.nextInt();
		
		int number1 = (((number % 1000 ) % 100 ) % 10 ) ;
		int number10 = (((number % 1000 ) % 100 ) / 10) ;
		int number100 = ((number % 1000 ) / 100 );
		int number1000 = (number / 1000) ;		
				
		System.out.println("Reversed :"+ number1+""+number10+""+number100+""+number1000);
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
	}

}

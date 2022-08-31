package weeks.week_03;

import java.util.Scanner;

public class Assignment03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your salary and your years of service");
		
		double salary = input.nextDouble();
		double years = input.nextDouble();
		
		if(years > 5 ) {
			System.out.println("You won the bonus. Your salary is : " + (salary * (1 + 0.05 )));
		}else System.out.println("Your salary is : " + salary );
			
		
	}
}

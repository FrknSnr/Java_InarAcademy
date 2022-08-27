package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a year");
		int year = input.nextInt();
		
		System.out.println("Enter the month between 1-12");
		int month = input.nextInt();
		
		System.out.println("Enter the day");
		int day = input.nextInt();
		
		int century = year / 100 + 1 ;
		double h = (day + ((26 * (month + 1)) / 10) + year + year/4 + century/4 + 5 * century) % 7 ;

		if(h==0) System.out.println("it is Saturday");
		if(h==1)System.out.println("it is Sunday");
		if(h==2)System.out.println("it is Monday");
		if(h==3)System.out.println("it is Tuesday");
		if(h==4)System.out.println("it is Wednesday");
		if(h==5)System.out.println("it is Thursday");
		else System.out.println("it is Friday");
	
	
	
	}

}

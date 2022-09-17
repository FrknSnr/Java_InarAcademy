package chapters.Chapter05.Exercises;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = input.nextInt();
		System.out.println("Enter the first day of the year ( 1 for monday - 2 for tuesday - 3 for wednesday ...");
		int day = input.nextInt();

		for(int i = 0 ; 1 < 12 ; i++) {
			switch(i) {
			case 0 : 
				System.out.println("January 1 , " + year + " is ");
			switch(day % 7) {
			case 0 : System.out.println("Sunday");break;
			case 1 : System.out.println("Monday");break;
			case 2 : System.out.println("Tuesday");break;
			case 3 : System.out.println("Wednesday");break;
			case 4 : System.out.println("Thursday");break;
			case 5 : System.out.println("Friday");break;
			case 6 : System.out.println("Saturday");break;
			}
			case 1 :
				System.out.println("February 1 , " + year + " is ");
			switch(day % 7) {
			case 0 : System.out.println("Sunday");break ;
			case 1 : System.out.println("Monday");break;
			case 2 : System.out.println("Tuesday");break;
			case 3 : System.out.println("Wednesday");break;
			case 4 : System.out.println("Thursday");break;
			case 5 : System.out.println("Friday");break;
			case 6 : System.out.println("Saturday");break;
			}
			day += ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28 ;
			break;
			case 2 :
			System.out.println("March 1," + year + " is ");
			switch(day % 7) {
			case 0 : System.out.println("Sunday");break ;
			case 1 : System.out.println("Monday");break;
			case 2 : System.out.println("Tuesday");break;
			case 3 : System.out.println("Wednesday");break;
			case 4 : System.out.println("Thursday");break;
			case 5 : System.out.println("Friday");break;
			case 6 : System.out.println("Saturday");break;
			}
			day+=31;
			break ;
			case 3 :
				System.out.println("April 1 ," + year + " is ");
			switch(day % 7) {
			case 0 : System.out.println("Sunday");break ;
			case 1 : System.out.println("Monday");break;
			case 2 : System.out.println("Tuesday");break;
			case 3 : System.out.println("Wednesday");break;
			case 4 : System.out.println("Thursday");break;
			case 5 : System.out.println("Friday");break;
			case 6 : System.out.println("Saturday");break;
			}
			day+=30;
			break;
			case 4 :
			System.out.println("May 1 ," + year + " is ");
			switch(day % 7) {
			case 0 : System.out.println("Sunday");break ;
			case 1 : System.out.println("Monday");break;
			case 2 : System.out.println("Tuesday");break;
			case 3 : System.out.println("Wednesday");break;
			case 4 : System.out.println("Thursday");break;
			case 5 : System.out.println("Friday");break;
			case 6 : System.out.println("Saturday");break;
			}
			day+=31;
			break ;
			case 5 :
				System.out.println("June 1, "+ year + " is ");
				switch(day % 7) {
				case 0 : System.out.println("Sunday");break ;
				case 1 : System.out.println("Monday");break;
				case 2 : System.out.println("Tuesday");break;
				case 3 : System.out.println("Wednesday");break;
				case 4 : System.out.println("Thursday");break;
				case 5 : System.out.println("Friday");break;
				case 6 : System.out.println("Saturday");break;
				}
				day+=30;
				break ;
				case 6 : 
				System.out.println("July 1 ," + year + " is ");
				switch(day % 7) {
				case 0 : System.out.println("Sunday");break ;
				case 1 : System.out.println("Monday");break;
				case 2 : System.out.println("Tuesday");break;
				case 3 : System.out.println("Wednesday");break;
				case 4 : System.out.println("Thursday");break;
				case 5 : System.out.println("Friday");break;
				case 6 : System.out.println("Saturday");break;
				}
				day+=31;
				break ;
				case 7 : 
				System.out.println("August 1 ," + year + " is ");
				switch(day % 7) {
				case 0 : System.out.println("Sunday");break ;
				case 1 : System.out.println("Monday");break;
				case 2 : System.out.println("Tuesday");break;
				case 3 : System.out.println("Wednesday");break;
				case 4 : System.out.println("Thursday");break;
				case 5 : System.out.println("Friday");break;
				case 6 : System.out.println("Saturday");break;
				}
				day+=31;
				break ;
				case 8 :
				System.out.println("September 1 ," + year + " is ");
				switch(day % 7) {
				case 0 : System.out.println("Sunday");break ;
				case 1 : System.out.println("Monday");break;
				case 2 : System.out.println("Tuesday");break;
				case 3 : System.out.println("Wednesday");break;
				case 4 : System.out.println("Thursday");break;
				case 5 : System.out.println("Friday");break;
				case 6 : System.out.println("Saturday");break;
				}
				day+=30;
				break;
				case 9 :
				System.out.println("October 1 ," + year + " is ");
				switch(day % 7) {
				case 0 : System.out.println("Sunday");break ;
				case 1 : System.out.println("Monday");break;
				case 2 : System.out.println("Tuesday");break;
				case 3 : System.out.println("Wednesday");break;
				case 4 : System.out.println("Thursday");break;
				case 5 : System.out.println("Friday");break;
				case 6 : System.out.println("Saturday");break;
				}
				day+=31;
				break;
				case 10 : 
				System.out.println("November 1 ," + year + " is ");
				switch(day % 7) {
				case 0 : System.out.println("Sunday");break ;
				case 1 : System.out.println("Monday");break;
				case 2 : System.out.println("Tuesday");break;
				case 3 : System.out.println("Wednesday");break;
				case 4 : System.out.println("Thursday");break;
				case 5 : System.out.println("Friday");break;
				case 6 : System.out.println("Saturday");break;
				}
				day+=30;
				break;
				case 11 :
				System.out.println("December 1 " + year + " is ");
				switch(day % 7) {
				case 0 : System.out.println("Sunday");break ;
				case 1 : System.out.println("Monday");break;
				case 2 : System.out.println("Tuesday");break;
				case 3 : System.out.println("Wednesday");break;
				case 4 : System.out.println("Thursday");break;
				case 5 : System.out.println("Friday");break;
				case 6 : System.out.println("Saturday");break;
				}
			
			}
			}
		
		
		
		
		
		
	}

}

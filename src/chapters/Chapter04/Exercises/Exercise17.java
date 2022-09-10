package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year and the first three letters of a month name with the first letter in uppercase");
		int year = input.nextInt();
		String month = input.next();

		boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		System.out.print(month + " " + year + " has ");
		
		if ( month.equals("Jan") || month.equals("Mar") || 
			  month.equals("May") || month.equals("Jul") ||
			  month.equals("Aug") || month.equals("Oct") ||
			  month.equals("Dec"))
			System.out.println(31 + " days");
		else if (month.equals("Apr") || month.equals("Jun") || 
			month.equals("Sep") || month.equals("Nov"))
			System.out.println(30 + " days");
		else
			System.out.println(((leapYear) ? 29 : 28) + " days");	
		
		
		
		
		
		
		
		
		
		
		
	}

}

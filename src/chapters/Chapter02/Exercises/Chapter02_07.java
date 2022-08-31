package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the minute");
	
		int minute = input.nextInt();
		
		int year = minute / (60*24*365);
		
		int day = (minute/60/24) % 365 ;
		
		System.out.println("it is :" + year + " and " + day + " days " );	
		
		
		
		
		
	}

}

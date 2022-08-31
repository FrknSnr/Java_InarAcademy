package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter today's number");
		
		int days = input.nextInt() ;
		
		System.out.println("Enter the number of days elapsed since today");
		
		int elapsed = input.nextInt();
		
		int today = ( days + elapsed ) % 7;
		
		if (today == 0) { 
				System.out.println("The day is Sunday" );}
		if (today == 1) { 
		System.out.println("Today is Monday ");}

		if ( today == 2) {
			System.out.println("Today is Tuesday "); }
		
		if ( today == 3) {
			System.out.println("Today is Wednesday"); }
		
		if ( today == 4) {
			System.out.println("Today is Thursday");}
		if ( today == 5) {
			System.out.println("Today is Friday ");}
		if ( today == 6) {System.out.println("Today is Saturday");}
		
		
		
		}
		
	
		
		
		
		
		
		
		}
		
		


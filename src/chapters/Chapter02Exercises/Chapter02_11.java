package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of years");
		
		int years = input.nextInt();
		
		int beginning = 312032486 ;
		
		double newBorns = (365*24*60*60) / 7 ;
		
		double deaths = (365*24*60*60) / 13 ;
		
		double newComers = (365*24*60*60) / 45 ;
		
		double firstYear =  beginning + newBorns + newComers - deaths ;
		
		double secondYear = firstYear +  newBorns + newComers - deaths ;
		
		double thirdYear = secondYear +   newBorns + newComers - deaths ;
		
		double fourthYear = thirdYear + newBorns + newComers - deaths ;
		
		double fifthYear = fourthYear + newBorns + newComers - deaths ;
		
		
		
		
	}

}

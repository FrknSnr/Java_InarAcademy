package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Chapter02_08 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in) ;
	
	System.out.println("Enter the time zone offset to GMT ");
	
	long GMT = input.nextInt() ;
	
	long past = System.currentTimeMillis();
	
	long totalSeconds = past / 1000 ;
	
	long hour = (totalSeconds / ( 60*60 )) % 24 ;
	
	long minute = (totalSeconds / 60 ) % 60 ;
	
	long second = totalSeconds % 60 ;
	
	long HOUR = hour + GMT ;
	if(HOUR > 24 || HOUR == 24)
		System.out.println(HOUR % 24+ " : " + minute + " : " + second );
	else
	System.out.println( HOUR + " : " + minute + " : " + second );

	}

}

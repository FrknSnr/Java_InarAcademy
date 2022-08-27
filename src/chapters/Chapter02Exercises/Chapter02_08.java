package chapters.Chapter02Exercises;

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
	
	System.out.println((hour + GMT )+ " : " + minute + " : " + second );

	}

}

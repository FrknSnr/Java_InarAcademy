package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_06 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number between 0 and 1000");
	
	int digit = input.nextInt();
	
	int digit1 = digit % 10 ;
	
	digit = digit / 10 ;
	
	int digit2 = digit % 10 ;
	
	digit = digit / 10 ;
	
	int digit3 = digit % 10 ;
	
	System.out.println(digit1 + digit2 + digit3 );
}
}
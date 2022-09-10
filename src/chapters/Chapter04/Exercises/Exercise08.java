package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code between 0 and 127 :");
		
		
		int ch = input.nextInt();
		if(ch >= 0 && ch <=127) {
		System.out.println((char)(ch) );
		}else System.err.print("Please enter a number as you were told ");
	}

}

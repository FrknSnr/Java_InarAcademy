package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1=input.next();
		String str2=input.next();
	
		if(str1.contains(str2))
			System.out.println(str2+ " is a substring of " + str1);
	
		else System.out.println(str2 +" is not a substring of " + str1);
	
	}

}

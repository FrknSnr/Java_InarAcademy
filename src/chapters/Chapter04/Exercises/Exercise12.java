package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit :");
		String hex = input.nextLine().toUpperCase();
		
		
		if(hex.length() !=1 )
		{System.out.println("Wrong input !");
		System.exit(1);
		}
		
		char ch = hex.charAt(0);
		if(ch <= 'F' && ch >= 'A' )
		{int value = ch - 'A' + 10 ;
		System.out.println("The decimal value for hex digit " + hex + " is: " + value);
		}
		else if (Character.isDigit(ch)) {
			System.out.println("The decimal value for hex digit is : " + ch);
		}
		else {System.out.println(ch + " is an invalid input ");
		}
		
		
		
		
		
		
	}

}

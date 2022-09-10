package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter");
		String letter = input.next().toUpperCase();
		char L = letter.charAt(0);
			
		if(L>='A' && L <='C')
		System.out.println("The number is " + 2);
	
		else if(L>='D' && L <='F')
		System.out.println("The number is " + 3);		
		
		else if(L>='G' && L <='I') 
		System.out.println("The number is " + 4);		
		
		else if(L>='J' && L <='L') 
		System.out.println("The number is " + 5);		
		
		else if(L>='M' && L <='O') 
		System.out.println("The number is " + 6);		
		
		else if(L>='P' && L <='S') 
		System.out.println("The number is " + 7);				
		
		else if(L>='T' && L <='V') 
		System.out.println("The number is " + 8);		
		
		else if(L>='W' && L <='Z') 
		System.out.println("The number is " + 9);		
		
		else
			System.out.println("It is an invalid input");
	

		
	}

}

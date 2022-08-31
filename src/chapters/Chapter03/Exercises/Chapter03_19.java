package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three edges of a trianle");
		
		double eI = input.nextDouble();
		double eII = input.nextDouble();
		double eIII = input.nextDouble();
		
		double p = eI + eII + eIII ;
		if (eI + eII > eIII && eI + eIII > eII && eII + eIII > eI)System.out.println("The input is " + p );
		else System.out.println("The input is invalid");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

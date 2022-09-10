package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter two characters /M for Math. /C for Computer /and I for Inf.Tech. ");
System.out.println("The numbers: 1 for Freshman / 2 for Sophomore /3 for Junior and /4 for Senior");
		String srt = input.next().toUpperCase();
		
		
		if(srt.contains("M1"))
		System.out.println("Mathematics Freshman");
		
		if(srt.contains("M2"))
		System.out.println("Mathematics Sophomore");
		
		if(srt.contains("M3"))
		System.out.println("Mathematics Junior");
		
		if(srt.contains("M4"))
		System.out.println("Mathematics Senior");
	
		
		if(srt.contains("C1"))
		System.out.println("Computer Science  Freshman");
		
		if(srt.contains("C2"))
		System.out.println("Computer Science  Sophomore");
		
		if(srt.contains("C3"))
		System.out.println("Computer Science  Junior");
		
		if(srt.contains("C4"))
		System.out.println("Computer Science Senior");
		
		if(srt.contains("I1"))
		System.out.println("Inf.Tech.  Freshman");
		
		if(srt.contains("I2"))
		System.out.println("Inf.Tech.  Sophomore");
		
		if(srt.contains("I3"))
		System.out.println("Inf.Tech. Junior");
		
		if(srt.contains("I4"))
		System.out.println("Inf.Tech. Senior");
		
		else System.out.println("Invalid character");
		
		
		
		
		
	}
	
	

}

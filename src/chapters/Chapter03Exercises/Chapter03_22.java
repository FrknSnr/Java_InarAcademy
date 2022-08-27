package chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter two coordinates of a point");
		double coX =input.nextDouble();
		double coY= input.nextDouble();
		double distance = Math.pow(((coX - 10)*(coX - 10)) + ((coY - 10) * (coY - 10)) , 0.5) ;
		if (distance <= 10)System.out.println("The point " + coX + ", " + coY + " is in the circle");
		if(distance>10) System.out.println("The point " + coX +", " +  coY + " is not in the circle");
		
		
		
	}

}

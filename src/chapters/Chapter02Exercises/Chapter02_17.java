package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_17 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature between -58*F and 41*F and then enter a wind speed greater than or equal to 2 " );
		
		double T = input.nextDouble();
		
		double WS = input.nextDouble();
		
		double twc = 35.74 + ( 0.6215 * T ) - ( 35.75 * Math.pow(WS, 0.16)) + (0.4275 * T * Math.pow(WS,0.16));
		
	System.out.println("The wind chill index is " + twc );	
		
		
	}
	
	
	

}

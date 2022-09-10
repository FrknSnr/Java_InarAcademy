package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Chapter03_20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature between -58F and 41F");
		double temp = input.nextDouble();
		
		System.out.println("Enter the wind speed greater than 2 or equal to it");
		double wind = input.nextDouble();
		
		
		if(temp <= 41 && temp >= -58 && wind >= 2) {
		double t = 35.74 + ( 0.6215 * temp ) - ((35.75) * Math.pow(wind,0.16 )) + ((0.4275 * temp) * Math.pow(wind, 0.16)) ;
		System.out.println("The wind-chill temperature is : " + t);
		}
		else System.out.println("The temperature or the wind speed is invalid");
		
		
		
	}

}

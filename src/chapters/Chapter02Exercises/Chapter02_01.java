package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a degree in celsius");

		double celsius = input.nextDouble();
		
		double fahrenheit = ( 9.0 / 5 ) * celsius + 32 ;
	
		System.out.println(fahrenheit);
	}

}

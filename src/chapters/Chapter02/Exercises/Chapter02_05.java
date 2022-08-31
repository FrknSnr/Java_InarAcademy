package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the subtotal and a gratuity rate");
		
		double subtotal = input.nextDouble();

		double gratuityRate = input.nextDouble();


		double output = subtotal * gratuityRate / 100;

		double total = subtotal + output;

		System.out.println("The gratuity is :"+ output + " and the total is " + total);

	}

}

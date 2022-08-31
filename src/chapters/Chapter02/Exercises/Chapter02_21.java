package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the investment amount :" ) ;
		System.out.println("Enter the annual interest rate in percentage :" ) ;
		System.out.println("Enter the number of years :" ) ;
		
		double amount = input.nextDouble();
		double rate = input.nextDouble();
		double years = input.nextDouble();
		
		double a = Math.pow((1 + rate),( years * 12) ) ;
		double future = amount * a ; 
		System.out.println("Accumulated value is : " + future );
		

	}

}

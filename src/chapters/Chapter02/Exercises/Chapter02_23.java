package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Firs the distance :  Second the miles per gallon :  Third the price per gallon ");
		
		double distance = input.nextDouble();
		double perGallon = input.nextDouble();
		double price = input.nextDouble();
		
		double cost = ( price * distance ) / perGallon ;
		
		System.out.println("The cost :" + cost );
	
	
	}
	
	

}

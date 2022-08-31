package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_09 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the v0 then v1 and then the t");
	
	double v0 = input.nextDouble();
	double v1 = input.nextDouble();
	double t  = input.nextDouble();
	
	double average = (v1 - v0) / t ;
	
	System.out.println("The average speed is : " + average);
	
	
	
	}

}

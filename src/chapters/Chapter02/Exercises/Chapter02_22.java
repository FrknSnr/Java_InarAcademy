package chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount, for ex : 1156");
		
		int money = input.nextInt(); 
		System.out.println(money + " is " + (money/ 100) + " dollars " + (money % 100) + " cents");

		
		
		
	}

}

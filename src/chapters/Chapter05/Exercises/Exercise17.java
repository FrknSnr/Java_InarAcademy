package chapters.Chapter05.Exercises;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines : ");
		int lines = input.nextInt();
		
		for (int i = 1 ; i <= lines ; i++) {
			for (int j = lines ; j >= i ; j--) {
				System.out.print("  ");
			}
			for (int k = i ; k >= 1 ; k--) {
				System.out.print(k + " ");
				
			}
			for (int l = 2 ; l <= i ; l++) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
		}
		
	}



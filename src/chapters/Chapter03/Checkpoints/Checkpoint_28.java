package chapters.Chapter03.Checkpoints;

import java.util.Scanner;

public class Checkpoint_28 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in) ;
		
		System.out.println("Enter the pound and the height");
		 double we = input.nextDouble();
		 double he = input.nextDouble();
		 
		 boolean result = we > 50 ^ he > 60 ;
		 System.out.println(result);
		
		
		
	}

}

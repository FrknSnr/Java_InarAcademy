package chapters.Chapter03.Checkpoints;

import java.util.Scanner;

public class Checkpoint_32 {

	public static void main(String[] args) {

		System.out.println("Enter a day number 0(monday), 1(tuesday), 2(wednesday), 3 ...or 7");
		Scanner input= new Scanner(System.in);
		int day = input.nextInt();
		
		switch(day) {
		case 0 : System.out.println("Monday") ; break;
		case 1 : System.out.println("Tuesday"); break;
		case 2 : System.out.println("Wednesday"); break ;
		case 3 : System.out.println("Thursday"); break ;
		case 4 : System.out.println("Friday"); break ;
		case 5 : System.out.println("Saturday"); break ;
		case 6 : System.out.println("Sunday"); 
		}
		
}
}
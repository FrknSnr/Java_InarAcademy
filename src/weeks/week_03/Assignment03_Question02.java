package weeks.week_03;

import java.util.Scanner;

public class Assignment03_Question02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 ages");
		int age1 = input.nextInt();
		int age3 = input.nextInt();
		int age2 = input.nextInt();
		
		int temp;
		
		if(age1 > age2)
		{	temp = age2;
			age2 = age1;
			age1 = temp;
		}if(age2 > age3) {
			temp = age3;
			age3 = age2;
			age2 = temp;
		}if(age1 > age2 ) 
		{   temp = age2;
			age2 = age1;
			age1 = temp;
		}
		System.out.println("The youngest one is :" + age1);
			System.out.println("The oldest one is :"+ age3);
		}
	
	
	
	
	
	}



package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee’s name (e.g., Smith)\r\n" + "Number of hours worked in a week (e.g., 10)\r\n"
				+ "Hourly pay rate (e.g., 9.75)\r\n" + "Federal tax withholding rate (e.g., 20%)\r\n"
				+ "State tax withholding rate (e.g., 9%) ");
		String name = input.next();
		int hours = input.nextInt();
		double HourlyPayRate = input.nextDouble();
		double FederalTax = input.nextDouble();
		double StateTax = input.nextDouble();

		double gross = HourlyPayRate * hours;
		double TotalTax = ((gross * 0.20) + (gross * 0.09)) ;
		System.out.println(
				"Employee's name :" + name + "\n  Hours Worked :" + hours + " \n   Pay rate :" + HourlyPayRate + " \n   Gross Pay : "
						+ gross +"\n  Deductions : " + "\n    Federal Withholding (20.0 %) :" + (gross * 0.20) + "\n    State Withholding ( 9.0%) :"
						+ (gross * 0.09) + "\n   Total Deduction :" + TotalTax + "\n   Net Pay : " + ( gross - TotalTax) );

	}

}

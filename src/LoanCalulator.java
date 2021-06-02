/**
 *Loan Calculator
 *	-> You take a loan from a friend and need to calculate how much you will owe him after 3 months.
 *	-> You are going to pay him back 10% of the remaining loan amount each month.
 *	-> Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.
 *
 *Sample Input: 20000
 *
 *Sample Output: 10628
 *
 *Here is the monthly payment schedule:
 *	Month 1: *Payment: 10% of 20000 = 2000
 *		Remaining amount: 18000
 *	Month 2: Payment: 10% of 18000 = 1800
 *		Remaining amount: 16200
 *	Month 3: Payment: 10% of 16200 = 1620
 *		Remaining amount: 14580
 *
 *
 *Hints:
 *	Use a loop to calculate the payment and remaining amounts for each month.
 *	Also, use integers for amounts.
 */

import java.util.Scanner;

public class LoanCalulator {

	public static void main(String[] args) {
		
		//Creating object of Scanner Class
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Loan Amount: ");
		int loanAmt = scan.nextInt();
		
		//To take dynamic month value
		System.out.print("No. of Months: ");
		int month = scan.nextInt();
				
		int returnRate = 10; //10%
		
		for(int i=1;i<=month;i++) {
			if(loanAmt <= 0)
			{
				System.out.println("No Loan Balance!");
				break;
			}
			loanAmt = loanAmt - (loanAmt * 10/100);	
			System.out.println("Loan Balance after "+i+" month is: "+loanAmt);
		}
	}

}

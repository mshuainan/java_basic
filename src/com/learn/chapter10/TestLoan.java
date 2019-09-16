package com.learn.chapter10;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/16  上午8:35
 * @description: 测试贷款类
 */
public class TestLoan {

	/**
	 * description: Main method
	 * @param args
	 * @return void
	 * @author shnma
	 * @date 2019/9/16 上午8:35
	 */
	public static void main(String[] args) {
		// Create Scanner
		Scanner scanner = new Scanner(System.in);

		// Enter yearly interest rate
		System.out.print("Enter yearly interest rate, for example, 8.25:");
		double annualInterestRate = scanner.nextDouble();

		// Enter number of years
		System.out.print("Enter number of years as an integer:");
		int numberOfYears = scanner.nextInt();

		// Enter loan amount
		System.out.print("Enter loan amount,for example, 120000.95:");
		double loanAmount = scanner.nextDouble();

		// Create a loan object
		Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);

		// Display loan date, monthly payment, and total payment
		System.out.printf("The loan was created on %s\n"
				+ "The monthly payment is %.2f\nThe total payment is %.2f\n",
				loan.getLoanDate(), loan.getMonthlyPayment(), loan.getTotalPayMent());
	}
}
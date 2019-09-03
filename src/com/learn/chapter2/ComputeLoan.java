package com.learn.chapter2;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/3  上午8:55
 * @description: 计算贷款支付额
 */
public class ComputeLoan {
	public static void main(String[] args){
		// Create a Scanner
		Scanner scanner = new Scanner(System.in);

		// Enter yearly interest rate
		System.out.print("Enter yearly interest rate, for example 8.25:");
		double annualInterestRate = scanner.nextDouble();

		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

		// Enter number of years
		System.out.print("Enter number of year as integer, for example 5: ");
		int numberOfYears = scanner.nextInt();

		// Enter loan amount
		System.out.print("Enter loan amount, for example: 120000.95: ");
		double loanAmount = scanner.nextDouble();

		// Calculate payment
		double monthPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthPayment * numberOfYears * 12;

		// Display results
		System.out.println("The monthly payment is " + (int)(monthPayment * 100) / 100.0);
		System.out.println("The total payment is " +  (int)(totalPayment * 100) / 100.0);

	}
}
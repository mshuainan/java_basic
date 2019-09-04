package com.learn.chapter2;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/4  下午8:07
 * @description: 整钱兑零
 */
public class ComputeChange {

	public static void main(String[] args){
		// Create a Scanner
		Scanner scanner = new Scanner(System.in);

		// Receive the Amount
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = scanner.nextDouble();

		int remainingAmount = (int)(amount * 100);

		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		// Find the number of quarters in the remaining amount
		int numberOfOneQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		// Find the number of dimes in the remaining amount
		int numberOfOneDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		// Find the number of nickels in the remaining amount
		int numberOfOneNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		// Find the number of pennies in the remaining amount
		int numberOfOnePennies = remainingAmount;

		// Display result
		System.out.print("Your amount " + amount + " consists of \n\t" + numberOfOneDollars + " dollars\n\t"
				+ numberOfOneQuarters + " quarters\n\t"
				+ numberOfOneDimes + " dimes\n\t"
				+ numberOfOneNickels + " nickels\n\t"
				+ numberOfOnePennies + " pennies\n\t");
	}
}
package com.learn.chapter3;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/7  下午4:07
 * @description: 计算税款
 */
public class ComputeTax {
	public static void main(String[] args){
		// Create a Scanner
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter  filing status
		System.out.print("0-single filer,1-married jointly," +
				"2-married separately,4-head of household\n" +
				"Enter the filing status:" );

		int status = scanner.nextInt();

		// Prompt the user to enter taxable income
		System.out.print("Enter the taxable income:");
		double income = scanner.nextDouble();

		// Compute tax
		double tax = 0;
		// Compute tax for single filers
		if(status == 0){
			if(income < 8530){
				tax = income * 0.10;
			} else if(income <= 33950){
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			} else if(income <= 82250){
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			} else if(income <= 171550){
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			} else if(income <= 372950){
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
						(171550 - 82250) * 0.28 + (income - 171550) * 0.33;
			} else {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
						(171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
			}
		// Compute tax for married file jointly
		} else if(status == 1){
			// Left as exercise
		// Compute tax for married separately
		} else if(status == 2){
			// Left as exercise
		// Compute tax for head of household
		} else if(status == 3){
			// Left as exercise
		} else {
			System.out.println("Error: invalid status");
			System.exit(0);
		}

		// Display result
		System.out.print("Tax is " + (int)(tax * 100) / 100.0);
	}
}
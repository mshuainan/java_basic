package com.learn.chapter4;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/8  上午11:05
 * @description: 求最大公约数
 */
public class GreatestCommonDivisor {
	public static void main(String[] args){
		// Create a Scanner
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter first integer: ");
		int n1 = scanner.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = scanner.nextInt();

		// Initial gcd is 1
		int gcd = 1;
		// Possible gcd
		int k = 2;
		while (k <= n1 && k <= n2){
			if(n1 % k == 0 && n2 % k == 0){
				// Update gcd
				gcd = k;
			}
			k++;
		}
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
	}
}
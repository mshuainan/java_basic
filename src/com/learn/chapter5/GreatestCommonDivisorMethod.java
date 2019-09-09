package com.learn.chapter5;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/9  下午10:22
 * @description: 用方法封装，求两个数的最大公约数
 */
public class GreatestCommonDivisorMethod {

	/**
	 * description:Main method
	 * @param args
	 * @return void
	 * @author shnma
	 * @date 2019/9/9 下午10:23
	 */
	public static void main(String[] args) {
		// Create Scanner
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter first integer:");
		int n1 = scanner.nextInt();
		System.out.print("Enter second integer:");
		int n2 = scanner.nextInt();

		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1,n2));
	}

	/**
	 * description: Return the gcd of two integers
	 * @param n1
	 * @param n2
	 * @return int
	 * @author shnma
	 * @date 2019/9/9 下午10:29
	 */
	public static int gcd(int n1, int n2){
		// Initial gcd is
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
		// Return gcd
		return gcd;
	}
}
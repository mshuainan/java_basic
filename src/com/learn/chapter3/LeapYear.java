package com.learn.chapter3;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/7  下午4:43
 * @description: 判断是否为闰年
 */
public class LeapYear {
	public static void main(String args[]){
		// Create a Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a year:");
		int year = scanner.nextInt();

		// Check if the year is a leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		// Display result
		System.out.print(year + " is a leap year? " + isLeapYear);
	}
}
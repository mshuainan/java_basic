package com.learn.chapter4;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/8  上午9:30
 * @description: 标志位控制的循环
 */
public class SentinelValue {

	public static void main(String[] args){
		// Create a scanner
		Scanner scanner = new Scanner(System.in);

		// Read an initial data
		System.out.print("Enter an int value(the program exits if the input is 0): ");
		int data = scanner.nextInt();

		// Keep reading data until the input is 0
		int sum = 0;
		while(data != 0){
			sum += data;

			// Read the next data
			System.out.print("Enter an int value(the program exits if the input is 0): ");
			data = scanner.nextInt();
		}

		System.out.println("The sum is " + sum);
	}
}
package com.learn.chapter4;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/8  上午9:30
 * @description: 标志位控制的循环-do-while
 */
public class TestDoWhile {

	public static void main(String[] args){
		int data;
		int sum = 0;

		// Create a scanner
		Scanner scanner = new Scanner(System.in);

		// Keep reading data until the input is 0
		do{
			// Read the next data
			System.out.print("Enter an int value(the program exits if the input is 0): ");
			data = scanner.nextInt();
			sum += data;
		} while (data != 0);

		System.out.println("The sum is " + sum);
	}
}
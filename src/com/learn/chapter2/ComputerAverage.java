package com.learn.chapter2;

import java.util.Scanner;

/**
 * description: 根据用户输入的数字，计算平均值
 * @author shnma
 * @date 2019/8/31 下午5:48
 */
public class ComputerAverage(){

	public static void main(Staring[] args){
		// Create a Scanner object
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter three numbers
		System.out.println("Enter three numbers:");
		double number1 = scanner.nextDouble();
		double number2 = scanner.nextDouble();
		double number3 = scanner.nextDouble();

		// Computer average
		double average = (number1 + number2 + number3) / 3

		// Display result
		System.out.println("The average of " number1 + " " + number2 + " " + number3 + " is " + average);
	}

}
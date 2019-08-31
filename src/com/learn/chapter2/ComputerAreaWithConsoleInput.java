package com.learn.chapter2;

import java.util.Scanner;

/**
 * description: 从控制台获取用户输入的半径计算圆的面积
 * @author shnma
 * @date 2019/8/31 下午5:15
 */
public class ComputerAreaWithConsoleInput {

	public static void main(String[] args){
		// Create a Scanner object
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = scanner.nextDouble();

		// Computer area
		double area = radius * radius * 3.1415926;

		// Display result
		System.out.println("The area for the circle of radius: "
				+ radius + " is " + area);
	}
}
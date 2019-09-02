package com.learn.chapter2;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/2  下午10:12
 * @description: 华氏度转换为摄氏度
 */
public class FahrenheitToCelsius {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a degree in Fahrenheit:");
		double fahrenheit = scanner.nextDouble();

		// Convert Fahrenheit to Celsius
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.print("Fahrenheit  " + fahrenheit + " is " + celsius + " in Celsius");
	}
}
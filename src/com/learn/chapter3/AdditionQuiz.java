package com.learn.chapter3;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/5  下午10:22
 * @description: 课堂测试
 */
public class AdditionQuiz {
	public static void main(String[] args){
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() * 7 % 10);

		// Create a Scanner
		Scanner scanner = new Scanner(System.in);

		System.out.print("Waht is " + number1 + " + " + number2 + "?");

		int answer = scanner.nextInt();

		System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
	}
}
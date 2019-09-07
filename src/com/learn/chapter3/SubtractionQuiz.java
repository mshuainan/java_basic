package com.learn.chapter3;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/7  下午3:03
 * @description: 改进版本的课堂测试
 */
public class SubtractionQuiz {
	public static void main(String[] args){
		// Create two random single-digit integers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		// If number1 < number2,swap number1 with number2
		if(number1 < number2){
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		// Prompt the student to answer "What is number1 - number2"
		System.out.print("What is " + number1 + " - " + number2 + " ?");
		Scanner scanner = new Scanner(System.in);
		int answer = scanner.nextInt();

		// Grade the answer and display the result
		if(number1 - number2 == answer){
			System.out.print("You are correct!");
		} else {
			System.out.print("Your answer is wong\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
		}
	}
}
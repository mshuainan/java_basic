package com.learn.chapter4;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/8  上午9:00
 * @description: 循环-课堂减法测试
 */
public class SubtractionQuizLoop {

	public static void main(String[] args){
		// Number of questions
		final int NUMBER_OF_QUESTIONS = 5;
		// Count the number of correct answers
		int correctCount = 0;
		// Count the number of questions
		int count = 0;
		// Start time
		long startTime = System.currentTimeMillis();
		// Output String is initially empty
		String output = "";
		Scanner scanner = new Scanner(System.in);

		while(count < NUMBER_OF_QUESTIONS){
			// Generate two random single-digit integers
			int number1 = (int)(Math.random() * 10);
			int number2 = (int)(Math.random() * 10);

			// If number1 < number2, swap number1 with number2
			if(number1 < number2){
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}

			// Prompt the student to answer "What is number1 - number2? "
			System.out.print("What is " + number1 + " - " + number2 + "? ");
			int answer = scanner.nextInt();

			// Grade the answer and display the result
			if(answer == number1 - number2){
				correctCount++;
				System.out.println("You are correct!");
			} else {
				System.out.println("Your answer is wrong.\n"
						+ number1 + " - " + number2 + " should be "
						+ (number1 - number2));
			}

			// Increase the count
			count++;

			output += "\n" + number1 + " - " + number2 + " = " + answer
					+ ((number1 - number2 == answer) ? " correct" : " wrong");
		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println("Correct count is " + correctCount
				+ "\nTest time is " + testTime / 1000 + " seconds\n"
				+ output);
	}
}
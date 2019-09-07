package com.learn.chapter3;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/7  下午4:53
 * @description: 彩票问题
 */
public class Lottery {
	public static void main(String[] args){
		// Generate a lottery
		int lottery = (int)(Math.random() * 100);

		// Prompt the user to enter a guess
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits)");
		int guess = scanner.nextInt();

		// Get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;

		// Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;

		System.out.println("The lottery number is " + lottery);

		// Check the guess
		if(guess == lottery){
			System.out.print("Exact match: you win $10000");
		} else if(guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1){
			System.out.print("Match all digits: you win $3000");
		} else if(guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit1){
			System.out.println("Match one digit: you win $1000");
		} else {
			System.out.println("Sorry, no match");
		}
	}
}
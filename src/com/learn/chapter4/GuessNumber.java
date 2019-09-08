package com.learn.chapter4;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/8  上午8:44
 * @description: 猜数字
 */
public class GuessNumber {
	public static void main(String[] args){
		// Generate a random number to be guessed
		int number = (int)(Math.random() * 101);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");

		int guess = -1;
		while(guess != number){
			// Prompt the user too guess the number
			System.out.print("Enter your guess: ");
			guess = scanner.nextInt();

			// start loop
			if(guess == number){
				System.out.println("Yes, the number is " + number);
			} else if(guess > number){
				System.out.println("Your guess is too high");
			} else {
				System.out.println("Your guess is too low");
			}
			// end loop
		}
	}
}
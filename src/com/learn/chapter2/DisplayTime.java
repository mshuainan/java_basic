package com.learn.chapter2;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/2  下午9:49
 * @description: 显示时间
 */
public class DisplayTime {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		// Prompt the user for input
		System.out.print("Enter an integer for seconds:");
		int seconds = scanner.nextInt();

		// Find minutes in seconds
		int minutes = seconds / 60;
		// Seconds remaining
		int remainingSeconds = seconds % 60;
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
	}
}
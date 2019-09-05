package com.learn.chapter3;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/5  下午10:36
 * @description: 简单的if-demo
 */
public class SimpleIfDemo {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();

		if(number % 5 == 0){
			System.out.println("HiFive");
		}

		if(number % 2 == 0){
			System.out.println("HiTwo");
		}
	}
}
package com.learn.chapter6;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/14  下午3:28
 * @description: 求100个数的平均数&大于平均数的个数
 */
public class AnalyzeNumbers {
	public static void main(String[] args) {
		final int NUMBER_OF_ELEMENTS = 5;
		double[] numbers = new double[NUMBER_OF_ELEMENTS];
		double sum = 0;

		Scanner scanner = new Scanner(System.in);
		for(int i = 1; i < NUMBER_OF_ELEMENTS; i++){
			System.out.print("Enter a new number: ");
			numbers[i] = scanner.nextDouble();
			sum += numbers[i];
		}

		double average = sum / NUMBER_OF_ELEMENTS;
		// The number of elements above average
		int count  = 0;
		for(int i = 0; i < NUMBER_OF_ELEMENTS; i++){
			if(numbers[i] > average){
				count++;
			}
		}

		System.out.println("Average is " + average);
		System.out.println("Number of element above the average " + count);
	}
}
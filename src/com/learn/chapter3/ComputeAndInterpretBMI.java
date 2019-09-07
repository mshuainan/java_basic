package com.learn.chapter3;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/7  下午3:31
 * @description: 计算身体质量指数
 */
public class ComputeAndInterpretBMI {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		//Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds:");
		double weight = scanner.nextDouble();

		// Prompt the user to enter height in inches
		System.out.print("Enter weight in inches:");
		double height = scanner.nextDouble();

		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCHE = 0.0254;

		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCHE;
		double bmi = weightInKilograms / Math.pow(heightInMeters,2);

		// DisPlay result
		System.out.println("Your BMI is " + bmi);
		if(bmi < 16){
			System.out.print("You are seriously underweight");
		} else if(bmi < 18){
			System.out.print("You are underweight");
		} else if(bmi < 24){
			System.out.print("You are normal weight");
		} else if(bmi < 29){
			System.out.print("You are overweight");
		} else if(bmi < 35){
			System.out.print("You are seriously overweight");
		} else {
			System.out.print("You are gravely overweight");
		}
	}
}
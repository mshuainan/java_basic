package com.learn.chapter6;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/14  下午4:04
 * @description: 乐透号码
 */
public class LottoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Default is false
		boolean[] isCovered = new boolean[99];

		// Read each number and mark its corresponding element covered
		int number = scanner.nextInt();
		while (number != 0){
			isCovered[number - 1] =  true;
			number = scanner.nextInt();
		}

		// Check whether all covered
		boolean allCovered = true;
		for(int i = 0; i < 99; i++){
			if(!isCovered[i]){
				allCovered = false;
				break;
			}
		}

		// Display result
		if(allCovered){
			System.out.println("The tickets cover all numbers");
		} else {
			System.out.println("The tickets don't cover all numbers");
		}
	}
}
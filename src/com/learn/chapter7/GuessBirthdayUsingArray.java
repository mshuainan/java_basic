package com.learn.chapter7;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/15  上午9:02
 * description: 猜生日使用数组-GuessBirthDay.java
 */
public class GuessBirthdayUsingArray {
	public static void main(String[] args) {
		// Day to be determined
		int day = 0;
		int answer;

		int[][][] dates = {
			{{1,3,5,7},
				{9,11,13,15},
				{17,19,21,23},
				{25,27,29,31}},
			{{2,3,6,7},
				{10,11,14,15},
				{18,19,22,23},
				{26,27,30,31}},
			{{4,5,6,7},
				{12,13,14,15},
				{20,21,22,23},
				{28,29,0,31}},
			{{8,9,10,11},
				{12,13,14,15},
				{24,25,26,27},
				{28,29,30,31}},
			{{16,17,18,19},
				{20,21,22,23},
				{24,25,26,27},
				{28,29,230,31}}
		};

		// Create a scanner
		Scanner scanner = new Scanner(System.in);

		for(int i = 0; i < 5; i++){
			System.out.println("Is your birthday is set" + (i + 1) + "?");
			for(int j = 0; j < 4; j++){
				for(int k = 0; k < 4; k++){
					System.out.printf("%4d", dates[i][j][k]);
				}
				System.out.println();
			}

			System.out.print("\nEnter 0 for no and 1 for yes:");
			answer = scanner.nextInt();

			if(answer == 1){
				day += dates[i][0][0];
			}
		}
		System.out.print("\nYour birthday is " + day + "!");
	}
}
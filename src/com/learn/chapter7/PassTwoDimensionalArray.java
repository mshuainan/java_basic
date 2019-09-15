package com.learn.chapter7;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/14  下午11:10
 * @description: 给方法传递二维数组
 */
public class PassTwoDimensionalArray {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner scanner = new Scanner(System.in);

		//Enter array values
		int[][] m = new int[3][4];
		System.out.println("Enter " + m.length + " rows and " + m[0].length + "columns: ");
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				m[i][j] = scanner.nextInt();
			}
		}

		// Display result
		System.out.println("\nSum of all elements is " + sum(m));
	}

	public static int sum(int[][] m){
		int total = 0;
		for(int row = 0; row < m.length; row++){
			for(int column = 0; column < m[row].length; column++){
				total += m[row][column];
			}
		}

		return total;
	}
}
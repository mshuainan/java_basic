package com.learn.chapter4;

/**
 * @author : mashuainan
 * create at:  2019/9/8  上午10:29
 * @description: 打印乘法表格
 */
public class MultiplicationTable {

	public static void main(String[] args){
		// Display the table heading
		System.out.println("			Multiplication Table");

		// Disply the number title
		System.out.print("    ");
		for(int j = 1; j <= 9; j++){
			System.out.print("   " + j);
		}
		System.out.println("\n----------------------------------------");

		// Print table body
		for (int i = 1; i <= 9; i++){
			System.out.print(i + " | ");
			for (int j = 1; j <= 9; j++){
				// Display the product and align properly
				System.out.printf("%4d",i * j);
			}
			System.out.println();
		}
	}
}
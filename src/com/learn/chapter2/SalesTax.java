package com.learn.chapter2;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/2  下午10:54
 * @description: 保留营业税小数点后两位
 */
public class SalesTax {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter purchase amount: ");
		double purchaseAmount = scanner.nextDouble();
		double tax = purchaseAmount * 0.06;
		System.out.print("Sales tax is " + (int)(tax * 100) / 100.0);
	}
}
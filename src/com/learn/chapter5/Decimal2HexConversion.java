package com.learn.chapter5;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/9  下午11:00
 * @description: 吧一个十进制的数转换为十六进制数
 */
public class Decimal2HexConversion {

	/**
	 * description: Main method
	 * @param args
	 * @return void
	 * @author shnma
	 * @date 2019/9/9 下午11:01
	 */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a decimal integer
		System.out.print("Enter a decimal number:");
		int decimal = scanner.nextInt();

		System.out.println("The hex number for decimal " + decimal + " is " + decimalToHex(decimal));
	}

	/**
	 * description: Convert a decimal to a hex as string
	 * @param decimal
	 * @return java.lang.String
	 * @author shnma
	 * @date 2019/9/9 下午11:11
	 */
	public static String decimalToHex(int decimal){
		String hex = "";

		while (decimal != 0){
			int hexValue = decimal % 16;
			hex = toHexChar(hexValue) + hex;
			decimal = decimal / 16;
		}
		return hex;
	}

	/**
	 * description: Convert an integer to a single hex digit in a character
	 * @param hexValue
	 * @return char
	 * @author shnma
	 * @date 2019/9/9 下午11:08
	 */
	public static char toHexChar(int hexValue){
		if(hexValue <= 9 && hexValue >= 0){
			return (char)(hexValue + '0');
		} else {
			return (char)(hexValue - 10 + 'A');
		}
	}
}
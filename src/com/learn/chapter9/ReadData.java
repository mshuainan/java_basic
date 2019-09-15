package com.learn.chapter9;

import java.io.File;
import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/15  下午5:07
 * @description: 使用Scanner读数据
 */
public class ReadData {
	public static void main(String[] args) throws Exception{
		// Create a file instance
		File file = new File("scores.txt");

		// Create a Scanner for the file
		Scanner input = new Scanner(file);

		// Read data from a file
		while (input.hasNext()){
			String firstName = input.next();
			String mi = input.next();
			String lastName = input.next();
			int score = input.nextInt();
			System.out.println(firstName + "," + mi + "," + lastName + "," + score);
		}

		// Close the file
		input.close();
	}
}
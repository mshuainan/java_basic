package com.learn.chapter6;

import com.learn.chapter5.TestRandomCharacter;

/**
 * @author : mashuainan
 * create at:  2019/9/14  下午5:18
 * @description: 统计每个字母出现的次数
 */
public class CountLettersInArray {

	/**
	 * description: Main Method
	 * @param args
	 * @return void
	 * @author shnma
	 * @date 2019/9/14 下午5:19
	 */
	public static void main(String[] args) {
		// Declare and create an array
		char[] chars = createArray();

		// Display the array
		System.out.println("The lowercase letters are:");
		displayArray(chars);

		// Count the occurrences of each letter
		int[] counts = countLetters(chars);

		// Display counts
		System.out.println();
		System.out.println("The occurrences of each letter are:");
		displayCounts(counts);
	}

	/**
	 * description: Create an array of characters
	 * @param
	 * @return char[]
	 * @author shnma
	 * @date 2019/9/14 下午5:23
	 */
	public static char[] createArray(){
		// Declare an array of characters and create it
		char[] chars = new char[100];

		// Create lowercase letters randomly and assign
		for(int i = 0; i < chars.length; i++){
			chars[i] = TestRandomCharacter.getRandomLowerCaseLetter();
		}

		return chars;
	}

	/**
	 * description: Display the array of characters
	 * @param chars
	 * @return void
	 * @author shnma
	 * @date 2019/9/14 下午5:28
	 */
	public static void displayArray(char[] chars){
		// Display the characters in the array 20 on each line
		for (int i = 0; i < chars.length; i++){
			if((i + 1) % 20 == 0){
				System.out.println(chars[i]);
			} else {
				System.out.print(chars[i] + " ");
			}
		}
	}

	/**
	 * description: Count the occurrences of each letter
	 * @param chars
	 * @return int[]
	 * @author shnma
	 * @date 2019/9/14 下午5:33
	 */
	public static int[] countLetters(char[] chars){
		// Declare and create an array of 26 int
		int[] counts = new int[26];

		// For each lowercase letter in the array, count it
		for(int i = 0; i < chars.length; i++){
			counts[chars[i] - 'a']++;
		}

		return counts;
	}

	/**
	 * description: Display counts
	 * @param counts
	 * @return void
	 * @author shnma
	 * @date 2019/9/14 下午5:35
	 */
	public static void displayCounts(int[] counts){
		for(int i = 0; i < counts.length; i++){
			if((i + 1) % 10 == 0){
				System.out.println(counts[i] + "-" + (char)(i + 'a'));
			} else {
				System.out.print(counts[i] + "-" + (char)(i + 'a') + " ");
			}
		}
	}
}
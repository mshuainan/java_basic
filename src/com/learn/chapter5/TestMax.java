package com.learn.chapter5;

/**
 * @author : mashuainan
 * create at:  2019/9/9  下午9:46
 * @description: 测试获取最大值
 */
public class TestMax {

	/**
	 * description: Main method
	 * @param args
	 * @return void
	 * @author shnma
	 * @date 2019/9/9 下午9:47
	 */
	public static void main(String[] args){
		int i = 5;
		int j = 2;
		int k = max(i, j);

		System.out.print("The maximum between " + i + " and " + j + " is " + k);
	}

	/**
	 * description: Return the max between two numbers
	 * @param num1
	 * @param num2
	 * @return int
	 * @author shnma
	 * @date 2019/9/9 下午9:51
	 */
	public static int max(int num1, int num2){
		int result;

		if(num1 > num2){
			result = num1;
		} else {
			result = num2;
		}
		return  result;
	}
}
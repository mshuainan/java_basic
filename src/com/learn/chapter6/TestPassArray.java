package com.learn.chapter6;

/**
 * @author : mashuainan
 * create at:  2019/9/14  下午5:01
 * @description: 测试数组参数
 */
public class TestPassArray {

	/**
	 * description: Main method
	 * @param args
	 * @return void
	 * @author shnma
	 * @date 2019/9/14 下午5:01
	 */
	public static void main(String[] args) {
		int[] a = {1, 2};

		// Swap elements using the swap method
		System.out.println("Before invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		swap(a[0], a[1]);
		System.out.println("After invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");

		// Swap elements using the swapFirstTwoInArray method
		System.out.println("Before invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		swapFirstTwoInArray(a);
		System.out.println("After invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
	}

	/**\
	 * description: Swap two variables
	 * @param n1
	 * @param n2
	 * @return void
	 * @author shnma
	 * @date 2019/9/14 下午5:03
	 */
	public static void swap(int n1, int n2){
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}

	/**
	 * description: Swap the first two elements in the array
	 * @param array
	 * @return void
	 * @author shnma
	 * @date 2019/9/14 下午5:05
	 */
	public static void swapFirstTwoInArray(int[] array){
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
	}
}
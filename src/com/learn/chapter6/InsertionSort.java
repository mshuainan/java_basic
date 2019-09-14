package com.learn.chapter6;

/**
 * @author : mashuainan
 * create at:  2019/9/14  下午10:30
 * @description: 插入排序
 */
public class InsertionSort {

	/**
	 * description: Main method
	 * @param args
	 * @return void
	 * @author shnma
	 * @date 2019/9/14 下午10:31
	 */
	public static void main(String[] args) {
		double[] list = {2, 5, 9};
		insertionSort(list);
	}

	/**
	 * description: The method for sorting the numbers
	 * @param list
	 * @return void
	 * @author shnma
	 * @date 2019/9/14 下午10:31
	 */
	public static void insertionSort(double[] list){
		/* insert list[i] into a sorted sublist list[0..i-1] so that listp[0..i] is sorted */
		for (int i = 1; i < list.length; i++){
			double currentElement = list[i];
			int k;
			for(k = i - 1; k >= 0 && list[k] > currentElement; k--){
				list[k + 1] = list[k];
			}

			// insert the current element into list[k + 1]
			list[k + 1] = currentElement;
		}
	}
}
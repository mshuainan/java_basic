package com.learn.chapter5;

/**
 * @author : mashuainan
 * create at:  2019/9/9  下午9:54
 * @description: 测试void方法
 */
public class TestVoidMethod {
	public static void main(String[] args){
		System.out.print("The grade is ");
		printGrade(78.5);

		System.out.print("The grade is ");
		printGrade(59.5);
	}

	/**
	 * description: 打印分数对应的等级
	 * @param score
	 * @return void
	 * @author shnma
	 * @date 2019/9/9 下午9:59
	 */
	public static void printGrade(double score){
		if(score >= 90.0){
			System.out.println("A");
		} else if(score >= 80.0){
			System.out.println("B");
		} else if(score >= 70.0){
			System.out.println("C");
		} else if(score >= 60.0){
			System.out.println("D");
		} else {
			System.out.println("E");
		}
	}
}
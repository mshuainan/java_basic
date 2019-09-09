package com.learn.chapter5;

/**
 * @author : mashuainan
 * create at:  2019/9/9  下午10:02
 * description: 测试返回等级方法
 */
public class TestReturnGradeMethod {
	public static void main(String[] args){

		System.out.println("The grade is " + getGrade(78.5));
		System.out.println("The grade is " + getGrade(59.5));
	}

	/**
	 * description:获取分数对应的等级
	 * @param score
	 * @return char
	 * @author shnma
	 * @date 2019/9/9 下午10:05
	 */
	public static char getGrade(double score){
		if(score >= 90){
			return 'A';
		} else if(score >= 80){
			return 'B';
		} else if(score >= 70){
			return 'C';
		} else if(score >= 60){
			return 'D';
		} else {
			return 'E';
		}
	}
}
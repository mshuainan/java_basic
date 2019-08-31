package com.learn.chapter2;

/**
 * description: 根据半径计算出圆的面积
 * @author shnma
 * @date 2019/8/31 下午4:46
 */
public class ComputerArea{

	public static void main(String[] args){
		// Declare radius
		double radius;
		// Declare area;
		double area;

		// Assign a radius
		radius = 20;
		
		// Computer area
		area = radius * radius * 3.1415926;
		
		// Display results
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}

}

package com.learn.chapter11;

/**
 * @author : mashuainan
 * create at:  2019/9/17  下午10:39
 * @description: 圆-子类
 */
public class Circle4 extends GeometricObject1{
	private double radius;

	public Circle4(){

	}

	public Circle4(double radius){
		this.radius = radius;
	}

	public Circle4(double radius, String color, boolean filled){
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea(){
		return radius * radius * Math.PI;
	}

	public double getDiameter(){
		return 2 * radius;
	}

	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}

	/**
	 * description: Print the circle info
	 * @param
	 * @return void
	 * @author shnma
	 * @date 2019/9/17 下午10:45
	 */
	public void printCircle(){
		System.out.println("The circle is created " + getDateCreated() + " and radius is " + radius);
	}
}
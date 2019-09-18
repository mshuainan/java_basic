package com.learn.chapter14;

import java.util.Date;

/**
 * @author : mashuainan
 * create at:  2019/9/18  下午9:35
 * @description: 几何抽象类
 */
public abstract class GeometricObject {

	private String color = "white";
	private boolean filled;
	private Date dateCreated;

	/**
	 * description: Construct a default geometric object
	 * @param
	 * @return
	 * @author shnma
	 * @date 2019/9/17 下午10:35
	 */
	public GeometricObject(){
		this.dateCreated = new Date();
	}

	/**
	 * description: Construct a geometric object with the specified color and filled value
	 * @param color
	 * @param filled
	 * @return
	 * @author shnma
	 * @date 2019/9/17 下午10:37
	 */
	public GeometricObject(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor:" + color + " and filled: " + filled;
	}

	/**
	 * description: Abstract method getArea
	 * @param
	 * @return double
	 * @author shnma
	 * @date 2019/9/18 下午9:38
	 */
	public abstract double getArea();

	/**
	 * description: Abstract method getPerimeter
	 * @param
	 * @return double
	 * @author shnma
	 * @date 2019/9/18 下午9:38
	 */
	public abstract double getPerimeter();
}
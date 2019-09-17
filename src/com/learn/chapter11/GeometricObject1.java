package com.learn.chapter11;

import java.util.Date;

/**
 * @author : mashuainan
 * create at:  2019/9/17  下午10:33
 * @description: 几何图形超类
 */
public class GeometricObject1 {
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
	public GeometricObject1(){
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
	public GeometricObject1(String color, boolean filled){
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
		return "GeometricObject1{" +
				"color='" + color + '\'' +
				", filled=" + filled +
				", dateCreated=" + dateCreated +
				'}';
	}
}
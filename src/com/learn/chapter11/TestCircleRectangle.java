package com.learn.chapter11;

/**
 * @author : mashuainan
 * create at:  2019/9/17  下午10:51
 * @description: 测试子类圆&矩形
 */
public class TestCircleRectangle {
	public static void main(String[] args) {
		Circle4 circle4 = new Circle4(1);

		System.out.println("A circle " + circle4.toString());
		System.out.println("The radius is  " + circle4.getRadius());
		System.out.println("The area is  " + circle4.getArea());
		System.out.println("The diameter is  " + circle4.getDiameter());

		Rectangle rectangle = new Rectangle(2, 4);
		System.out.println("\nA rectangle " + rectangle.toString());
		System.out.println("The area is  " + rectangle.getArea());
		System.out.println("The perimeter is  " + rectangle.getPerimeter());

	}
}
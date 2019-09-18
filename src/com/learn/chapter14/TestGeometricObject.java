package com.learn.chapter14;

/**
 * @author : mashuainan
 * create at:  2019/9/17  下午10:51
 * @description: 测试子类圆&矩形
 */
public class TestGeometricObject {

	/**
	 * description: Main method
	 * @param args
	 * @return void
	 * @author shnma
	 * @date 2019/9/18 下午9:42
	 */
	public static void main(String[] args) {
		// Create two geometric object
		GeometricObject geometricObject1 = new Circle(5);
		GeometricObject geometricObject2 = new Rectangle(5, 3);

		System.out.println("The two objects have the same area? " + equalArea(geometricObject1, geometricObject2));

		// Display circle
		displayGeometircObject(geometricObject1);
		// Display rectangle
		displayGeometircObject(geometricObject2);

	}

	/**
	 * description: A method for comparing the areas of two geometric objects
	 * @param geometricObject1
	 * @param geometricObject2
	 * @return boolean
	 * @author shnma
	 * @date 2019/9/18 下午9:46
	 */
	public static boolean equalArea(GeometricObject geometricObject1, GeometricObject geometricObject2){
		return geometricObject1.getArea() == geometricObject2.getArea();
	}

	/**
	 * description: A method for display a geometric object
	 * @param geometricObject
	 * @return void
	 * @author shnma
	 * @date 2019/9/18 下午9:50
	 */
	public static void displayGeometircObject(GeometricObject geometricObject){
		System.out.println();
		System.out.println("The area is " + geometricObject.getArea());
		System.out.println("The perimeter is " + geometricObject.getPerimeter());
	}
}
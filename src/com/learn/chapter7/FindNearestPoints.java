package com.learn.chapter7;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/15  上午8:33
 * @description: 找出距离最近的点
 */
public class FindNearestPoints {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int numberOfPoints = scanner.nextInt();

		// Create an array to store points
		double[][] points = new double[numberOfPoints][2];
		System.out.print("Enter " + numberOfPoints + " points:");
		for(int i = 0; i < points.length; i++){
			points[i][0] = scanner.nextDouble();
			points[i][1] = scanner.nextDouble();
		}

		// p1 and p2 are the indices in the points array
		int p1 = 0, p2 = 1;
		double shortesDistance = distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);

		// Compute distance for every two points
		for(int i = 0; i < points.length; i++){
			for(int j = i + 1; j < points.length; j++){
				double distance = distance(points[i][0],points[i][1],points[j][0],points[j][1]);
				if(shortesDistance > distance){
					// Update p1
					p1 = i;
					// Update p2
					p2 = j;
					// Update distance
					shortesDistance = distance;
				}
			}
		}

		// Display result
		System.out.println("The closest two points are (" + points[p1][0] + "," +points[p1][1]
				+ ") and (" + points[p2][0] + "," +points[p2][1] + ")");
	}

	/**
	 * description: 计算两点间的距离
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return double
	 * @author shnma
	 * @date 2019/9/15 上午8:41
	 */
	public static double distance(double x1, double y1, double x2, double y2){
		return Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y1 - y2), 2));
	}
}
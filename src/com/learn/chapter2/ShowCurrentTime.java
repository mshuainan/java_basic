package com.learn.chapter2;

/**
 * @author : mashuainan
 * create at:  2019/9/2  下午10:25
 * @description: 展示当前时间的时分秒
 */
public class ShowCurrentTime {
	public static void main(String[] args){
		// Obtain the total milliseconds since midnight, jan 2, 1970
		long totalMilliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnight, jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute current hour
		long currentHour = totalHours % 24;

		// Display results
		System.out.print("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
	}
}
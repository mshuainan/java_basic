package com.learn.chapter5;

import java.util.Scanner;

/**
 * @author : mashuainan
 * create at:  2019/9/11  下午7:12
 * @description: 打印日历
 */
public class PrintCalendar {

	/**
	 * description:Main method
	 * @param args
	 * @return void
	 * @author shnma
	 * @date 2019/9/11 下午7:12
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter year
		System.out.print("Enter full year(e.g.,2001):");
		int year = scanner.nextInt();

		//Prompt the user to enter month
		System.out.print("Enter month as number between 1 and 12:");
		int month = scanner.nextInt();

		// Print calendar for the month of the year
		printMonth(year, month);
	}

	/**
	 * description: A stub for printMonth may look like this
	 * @param year
	 * @param month
	 * @return void
	 * @author shnma
	 * @date 2019/9/11 下午7:17
	 */
	public static void printMonth(int year, int month){
		// Print the headings of the calender
		printMonthTitle(year, month);

		// Print the body of the calender
		printMonthBody(year, month);
	}

	/**
	 * description: A stub for printMonthTitle may look like this
	 * @param year
	 * @param month
	 * @return void
	 * @author shnma
	 * @date 2019/9/11 下午7:18
	 */
	public static void printMonthTitle(int year, int month){
		System.out.println("		" + getMonthName(month) + " " + year);
		System.out.println("----------------------------------");
		System.out.println(" Sun  Mon  Tue  Wed  Thu  Fir  Sat");

	}

	/**
	 * description: A stub for printMonthBody mqy look like this
	 * @param year
	 * @param month
	 * @return void
	 * @author shnma
	 * @date 2019/9/11 下午7:19
	 */
	public static void printMonthBody(int year, int month){

	}

	/**
	 * description: A stub for getMonthName may look like this
	 * @param month
	 * @return java.lang.String
	 * @author shnma
	 * @date 2019/9/11 下午7:21
	 */
	public static String getMonthName(int month){
		String monthName = "";
		switch (month){
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				break;
			case 3:
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				break;
			case 7:
				monthName = "July";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "November";
				break;
			case 12:
				monthName = "December";
				break;
			default:
				monthName = "January";
		}
		return monthName;
	}

	/**
	 * description: A stub for getStartDay may look like this
	 * @param year
	 * @param month
	 * @return int
	 * @author shnma
	 * @date 2019/9/11 下午7:23
	 */
	public static int getStartDay(int year, int month){
		return 1;
	}

	/**
	 * description: A stub for getTotalNumberOfDays may look like this
	 * @param year
	 * @param month
	 * @return int
	 * @author shnma
	 * @date 2019/9/11 下午7:24
	 */
	public static int getTotalNumberOfDays(int year, int month){
		return 10000;
	}

	/**
	 * description: A stub for getlNumberOfDaysInMonth may look like this
	 * @param year
	 * @param month
	 * @return int
	 * @author shnma
	 * @date 2019/9/11 下午7:24
	 */
	public static int getlNumberOfDaysInMonth(int year, int month){
		return 31;
	}

	/**
	 * description:A stub for isLeapYear may look like this
	 * @param year
	 * @return boolean
	 * @author shnma
	 * @date 2019/9/11 下午7:26
	 */
	public static boolean isLeapYear(int year){
		return true;
	}
}
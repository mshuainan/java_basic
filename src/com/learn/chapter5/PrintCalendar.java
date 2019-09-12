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
	 * description: Print the calender for a month in a year
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
	 * description: Print the month title , e.g.,May 1999
	 * @param year
	 * @param month
	 * @return void
	 * @author shnma
	 * @date 2019/9/11 下午7:18
	 */
	public static void printMonthTitle(int year, int month){
		System.out.println("		" + getMonthName(month) + " " + year);
		System.out.println("----------------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fir Sat");
	}

	/**
	 * description: Print month body
	 * @param year
	 * @param month
	 * @return void
	 * @author shnma
	 * @date 2019/9/11 下午7:19
	 */
	public static void printMonthBody(int year, int month){
		// Get start day of the week for the first date in the month
		int startDay = getStartDay(year,month);

		// Get number of days in the month
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year,month);

		// Pad space before the first day of the month
		for (int i = 0; i < startDay; i++){
			System.out.print("	");
		}

		for(int i = 1; i < numberOfDaysInMonth; i++){
			System.out.printf("%4d", i);
			if((i + startDay) % 7 == 0){
				System.out.println();
			}
		}
		System.out.println();
	}

	/**
	 * description: Get the english name for the month
	 * @param month
	 * @return java.lang.String
	 * @author shnma
	 * @date 2019/9/11 下午7:21
	 */
	public static String getMonthName(int month){
		String monthName;
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
	 * description: Get the start day of month/1/year
	 * @param year
	 * @param month
	 * @return int
	 * @author shnma
	 * @date 2019/9/11 下午7:23
	 */
	public static int getStartDay(int year, int month){
		final int START_DAY_FOR_JAN_1_1800 = 3;

		// Grt total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year,month);

		// Return the start day for month/1/year
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}

	/**
	 * description: Get the total number of days since January 1, 1800
	 * @param year
	 * @param month
	 * @return int
	 * @author shnma
	 * @date 2019/9/11 下午7:24
	 */
	public static int getTotalNumberOfDays(int year, int month){
		int total = 0;

		// Get the total days from 1800 to 1/1/year
		for(int i = 1800; i < year; i++){
			if(isLeapYear(i)){
				total += 366;
			} else {
				total += 365;
			}
		}

		// Add days from jan to the month prior to the calender month
		for(int i = 0; i < month; i++){
			total += getNumberOfDaysInMonth(year,i);
		}

		return total;
	}

	/**
	 * description: Get the number of day in a month
	 * @param year
	 * @param month
	 * @return int
	 * @author shnma
	 * @date 2019/9/11 下午7:24
	 */
	public static int getNumberOfDaysInMonth(int year, int month){
		if(month == 1 || month == 3 || month == 5 ||month == 7
				|| month == 8 ||month == 10 || month == 12){
			return 31;
		}

		if(month == 4 || month == 6 || month == 9 ||month == 11){
			return 31;
		}
		if(month == 2){
			return isLeapYear(year) ? 29 : 28;
		}

		// If month is incorrect
		return 0;
	}

	/**
	 * description: Determine if it is a leap year
	 * @param year
	 * @return boolean
	 * @author shnma
	 * @date 2019/9/11 下午7:26
	 */
	public static boolean isLeapYear(int year){
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

}
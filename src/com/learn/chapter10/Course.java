package com.learn.chapter10;

/**
 * @author : mashuainan
 * create at:  2019/9/17  上午8:16
 * @description: 选课
 */
public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName){
		this.courseName = courseName;
	}

	public void addStudent(String student){
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
}
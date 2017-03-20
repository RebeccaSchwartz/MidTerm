package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	
	public Course(String CourseName, int GradePoints, eMajor Major) {
		// TODO Auto-generated constructor stub
	}
	private String CourseName;
	private int GradePoints;
	private UUID CourseID;
	private eMajor Major;
	public Course(String courseName, int gradePoints, UUID courseID, eMajor major) {
		CourseName = courseName;
		GradePoints = gradePoints;
		CourseID = courseID;
		Major = major;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		this.CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		this.GradePoints = gradePoints;
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}
	public eMajor getMajor() {
		return Major;
	}
	public void setMajor(eMajor major) {
		this.Major = major;
	}
	
	

}

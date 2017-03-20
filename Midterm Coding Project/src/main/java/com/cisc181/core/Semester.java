package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Semester {
	
	public Semester(Date StartDate, Date EndDate) {
		// TODO Auto-generated constructor stub
	}
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	public Semester(UUID semesterID, Date startDate, Date endDate) {
		SemesterID = semesterID;
		StartDate = startDate;
		EndDate = endDate;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		this.SemesterID = semesterID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		this.StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		this.EndDate = endDate;
	}
	

}

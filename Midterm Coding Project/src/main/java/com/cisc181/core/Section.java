package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private UUID RoomID;
	public Section(UUID courseID, UUID semesterID, UUID sectionID, UUID roomID) {
		CourseID = courseID;
		SemesterID = semesterID;
		SectionID = sectionID;
		RoomID = roomID;
	}
	public Section(UUID courseID, UUID semesterID) {
		CourseID = courseID;
		SemesterID = semesterID;
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		this.SemesterID = semesterID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		this.SectionID = sectionID;
	}
	public UUID getRoomID() {
		return RoomID;
	}
	public void setRoomID(UUID roomID) {
		this.RoomID = roomID;
	}

	
}

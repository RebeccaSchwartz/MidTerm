package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

import exceptions.PersonException;

public class Student_Test {
	
	
	static ArrayList<Course> course = new ArrayList<Course>();
	static ArrayList<Semester> semester = new ArrayList<Semester>();
	static ArrayList<Section> section = new ArrayList<Section>();
	static ArrayList<Student> student = new ArrayList<Student>();
	private static Date newDate(int i, int j, int k) {
		Calendar C = Calendar.getInstance();
		C.set(i, j, k);
		return C.getTime();
	}
	static ArrayList<Enrollment> FMath242 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> SMath242 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> FEcon103 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> SEcon103 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> FCisc181 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> SCisc181 = new ArrayList<Enrollment>();

	@BeforeClass
	public static void setup() throws PersonException {
		Course MATH242 = new Course("MATH242",4,eMajor.CHEM);
		Course ECON103 = new Course("ECON103",3,eMajor.BUSINESS);
		Course CISC181 = new Course("CISC181",4,eMajor.COMPSI);
		course.add(MATH242);
		course.add(ECON103);
		course.add(CISC181);
		
		Semester Fall = new Semester(newDate(8, 27, 2016), newDate(12,17,2016));
		Semester Spring = new Semester(newDate(2, 6, 2017), newDate(5,16,2017));
		semester.add(Fall);
		semester.add(Spring);
		
		Section FallMath242 = new Section(MATH242.getCourseID(), Fall.getSemesterID());
		Section SpringMath242 = new Section(MATH242.getCourseID(), Spring.getSemesterID());
		Section FallEcon103 = new Section(ECON103.getCourseID(), Fall.getSemesterID());
		Section SpringEcon103 = new Section(ECON103.getCourseID(), Spring.getSemesterID());
		Section FallCisc181 = new Section(CISC181.getCourseID(), Fall.getSemesterID());
		Section SpringCisc181 = new Section(CISC181.getCourseID(), Spring.getSemesterID());
		section.add(FallMath242);
		section.add(SpringMath242);
		section.add(FallEcon103);
		section.add(SpringEcon103);
		section.add(FallCiscC181);
		section.add(SpringCisc181);
		
		Student Student1 = new Student("Rebecca", "Elizabeth", "Schwartz", newDate(4, 13, 1998),eMajor.BUSINESS,"35 Ray Street, Newark, DE ","(717)-123-4567","reschwar@udel.edu");
		Student Student2 = new Student("Rebecca", "Elizabeth", "Schwartz", newDate(4, 13, 1998),eMajor.BUSINESS,"35 Ray Street, Newark, DE ","(717)-123-4567","reschwar@udel.edu");
		Student Student3 = new Student("Rebecca", "Elizabeth", "Schwartz", newDate(4, 13, 1998),eMajor.BUSINESS,"35 Ray Street, Newark, DE ","(717)-123-4567","reschwar@udel.edu");
		Student Student4 = new Student("Rebecca", "Elizabeth", "Schwartz", newDate(4, 13, 1998),eMajor.BUSINESS,"35 Ray Street, Newark, DE ","(717)-123-4567","reschwar@udel.edu");
		Student Student5 = new Student("Rebecca", "Elizabeth", "Schwartz", newDate(4, 13, 1998),eMajor.BUSINESS,"35 Ray Street, Newark, DE ","(717)-123-4567","reschwar@udel.edu");
		Student Student6 = new Student("Rebecca", "Elizabeth", "Schwartz", newDate(4, 13, 1998),eMajor.BUSINESS,"35 Ray Street, Newark, DE ","(717)-123-4567","reschwar@udel.edu");
		Student Student7 = new Student("Rebecca", "Elizabeth", "Schwartz", newDate(4, 13, 1998),eMajor.BUSINESS,"35 Ray Street, Newark, DE ","(717)-123-4567","reschwar@udel.edu");
		Student Student8 = new Student("Rebecca", "Elizabeth", "Schwartz", newDate(4, 13, 1998),eMajor.BUSINESS,"35 Ray Street, Newark, DE ","(717)-123-4567","reschwar@udel.edu");
		Student Student9 = new Student("Rebecca", "Elizabeth", "Schwartz", newDate(4, 13, 1998),eMajor.BUSINESS,"35 Ray Street, Newark, DE ","(717)-123-4567","reschwar@udel.edu");
		Student Student10 = new Student("Rebecca", "Elizabeth", "Schwartz", newDate(4, 13, 1998),eMajor.BUSINESS,"35 Ray Street, Newark, DE ","(717)-123-4567","reschwar@udel.edu");
		student.add(Student1);
		student.add(Student2);
		student.add(Student3);
		student.add(Student4);
		student.add(Student5);
		student.add(Student6);
		student.add(Student7);
		student.add(Student8);
		student.add(Student9);
		student.add(Student10);
		
		for (Student student: student){
			FMath242.add(new Enrollment(student.getStudentID(), FallMath242.getSectionID()));
			SMath242.add(new Enrollment(student.getStudentID(), SpringMath242.getSectionID()));
			FEcon103.add(new Enrollment(student.getStudentID(), FallEcon103.getSectionID()));
			SEcon103.add(new Enrollment(student.getStudentID(), SpringEcon103.getSectionID()));
			FCisc181.add(new Enrollment(student.getStudentID(), FallCisc181.getSectionID()));
			SCisc181.add(new Enrollment(student.getStudentID(), SpringCisc181.getSectionID()));
			FMath242.get(student).setGrade(60);
			SMath242.get(student).setGrade(70);
			FEcon103.get(student).setGrade(80);
			SEcon103.get(student).setGrade(90);
			FCisc181.get(student).setGrade(100);
			SCisc181.get(student).setGrade(90);
	 
	}

	@Test
	public void testGPA{
		
		
	}
	
	public static double CourseAverage(ArrayList <Enrollment>){
		double sum = 0;
		double average = 0;
		for(Course course: Course){
			sum = sum + course.get(course).getGrade();
			average = average / student.size();
		}
		return average;
	}
	@Test
	public void testCourseAverage{
		assertTrue(60,CourseAverage(FMath242));
		assertTrue(70,CourseAverage(SMath242));
		assertTrue(80,CourseAverage(FEcon103));
		assertTrue(90,CourseAverage(SEcon103));
		assertTrue(100,CourseAverage(FCisc181));
		assertTrue(90,CourseAverage(SCisc181));
		
		}
		
	}
	@Test
	public void testChangeMajor{
		student.get(1).setMajor(eMajor.CHEM);
		assertTrue(student.get(1).getMajor() == eMajor.CHEM);
		
		
			
		}
		
		
		
		
	}
}
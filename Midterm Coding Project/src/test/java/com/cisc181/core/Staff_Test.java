package com.cisc181.core;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import exceptions.PersonException;
import com.cisc181.eNums.eTitle;


public class Staff_Test {
	
	public static ArrayList<Staff> staff = new ArrayList<Staff>();
	


	@BeforeClass
	public static void setup() throws PersonException{
		staff.add(new Staff("Rebecca", "Elizabeth", "Schwartz", newDate(1998, 4, 13),"35 Ray Street, Newark, DE ",
				"(717)-123-4567","reschwar@udel.edu","Friday 2-4PM",1, 100000, newDate(2013, 4,13), eTitle.MS));
		staff.add(new Staff("David", "Shawn", "Schwartz", newDate(1972, 12, 3),"Windsor Rd., Windsor, PA ",
				"(800)-555-2233","davschwar@udel.edu","Monday 2-4PM",1, 80000, newDate(2005, 9,20), eTitle.MR));
		staff.add(new Staff("Jackie", "Ann", "Seitz", newDate(1944, 2, 11),"100 Market Street, York, MD ",
				"(443)-333-2222","jacseitz@udel.edu","Thursday 2-4PM",1, 90000, newDate(2011, 6,15), eTitle.MRS));
		staff.add(new Staff("Patrick", "Scott", "McClane", newDate(1980, 12, 22),"91 North Street, Mt Wolf, New Jersey ",
				"(919)-123-2233","patmcclane@udel.edu","Tuesday 2-4PM",1, 110000, newDate(2004, 8,25), eTitle.MR));
		staff.add(new Staff("Nautica", "Heart", "Chance", newDate(1979, 8, 24),"8 Elmwood Rd, Baltimore, MD ",
				"(443)-123-4567","nauchance@udel.edu","Monday 2-4PM",1, 100000, newDate(2016, 8, 6), eTitle.MS));
	}
	@Test
	public void Salaries(){
		double sum = 0;
		for (Staff staff: staff){
			sum = sum + staff.getSalary();
		}
		double average = (sum / staff.size());
		assertTrue(average == 96000);
		
	}
	
	private static Date newDate(int i, int j, int k) {
		Calendar C = Calendar.getInstance();
		C.set(i, j, k);
		return C.getTime();
	}
 
	@Test (expected = PersonException.class)
	public void PhoneTest() throws PersonException{
		new Staff("Nautica", "Heart", "Chance", newDate(1979, 8, 24),"8 Elmwood Rd, Baltimore, MD ",
				"(443)-1323-4567","nauchance@udel.edu","Monday 2-4PM",1, 100000, newDate(2016, 8, 6), eTitle.MS);
		
	}	
	@Test (expected = PersonException.class)
	public void DOBTest() throws PersonException{
		new Staff("Nautica", "Heart", "Chance", newDate(1500, 8, 24),"8 Elmwood Rd, Baltimore, MD ",
				"(443)-123-4567","nauchance@udel.edu","Monday 2-4PM",1, 100000, newDate(2016, 8, 6), eTitle.MS);
		
	}	

}

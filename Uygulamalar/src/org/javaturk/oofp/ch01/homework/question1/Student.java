package org.javaturk.oofp.ch01.homework.question1;

import java.util.Date;

class Student {

	protected int no;
	protected String name;
	protected int year;
	protected Date dob;
	protected String major;

	public Student(int no, String name, int year, Date dob, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}

	void study() {

	}

	void register() {

	}

	@Override
	public String toString() {
		return "Student : " + "\nno = " + no + "\nname = " + name + "\nyear = " + year + "\ndob = " + dob + "\nmajor = "
				+ major;
	}

}
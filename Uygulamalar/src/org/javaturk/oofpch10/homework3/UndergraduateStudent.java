package org.javaturk.oofpch10.homework3;

import java.util.Date;

public class UndergraduateStudent extends Student {

	private String minor;

	public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;
	}

	@Override
	void study() {
		System.out.println("study method in UndergraduateStudent class");
	}

	@Override
	void register() {
		System.out.println("register method in UndergraduateStudent class");
	}

	@Override
	public String toString() {
		return "Student : " + "\nno = " + no + "\nname = " + name + "\nyear = " + year + "\ndob = " + dob + "\nmajor = "
				+ major + "\nminor = " + minor;
	}

	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

}

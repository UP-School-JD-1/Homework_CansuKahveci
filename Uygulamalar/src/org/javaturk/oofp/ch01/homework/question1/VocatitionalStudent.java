package org.javaturk.oofp.ch01.homework.question1;

import java.util.Date;

public class VocatitionalStudent extends Student {

	public VocatitionalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}

	@Override
	void study() {
		System.out.print("study method in VocationalStudent class");
	}

	@Override
	void register() {
		System.out.print("register method in VocationalStudent class");
		super.register();
	}

	@Override
	public String toString() {
		return "Student : " + 
				"\nno = " + no + 
				"\nname = " + name +
				"\nyear = " + year + 
				"\ndob = " + dob +
				"\nmajor = "+ major;
	}

}

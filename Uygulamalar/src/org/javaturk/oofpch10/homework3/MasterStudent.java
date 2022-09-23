package org.javaturk.oofpch10.homework3;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, Date dob, String major, String minor, String advisor) {
		super(no, name, year, dob, major, advisor);
	}

	@Override
	void study() {
		System.out.println("study method in MasterStudent class");
	}

	@Override
	void register() {
		System.out.println("register method in MasterStudent class");
	}

	@Override
	void writeThesis() {
		System.out.println("writeThesis method in MasterStudent class");
	}

	@Override
	void meetWithAdvisor() {
		System.out.print("meetWithAdvisor method in MasterStudent class");
	}

}

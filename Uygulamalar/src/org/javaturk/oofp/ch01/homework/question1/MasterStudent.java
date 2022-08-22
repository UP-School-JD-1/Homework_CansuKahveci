package org.javaturk.oofp.ch01.homework.question1;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, Date dob, String major, String minor, String advisor) {
		super(no, name, year, dob, major, advisor);
	}

	@Override
	void study() {
		System.out.print("study method in MasterStudent class");
	}

	@Override
	void register() {
		System.out.print("register method in MasterStudent class");
	}

	@Override
	void writeThesis() {
		System.out.print("writeThesis method in MasterStudent class");
	}

	@Override
	void meetWithAdvisor() {
		System.out.print("meetWithAdvisor method in MasterStudent class");
	}

}

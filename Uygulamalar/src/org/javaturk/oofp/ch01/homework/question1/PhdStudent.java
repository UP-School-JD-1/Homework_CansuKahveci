package org.javaturk.oofp.ch01.homework.question1;

import java.util.Date;

public class PhdStudent extends GraduateStudent {

	private boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, Date dob, String major, String advisor,
			boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	@Override
	void study() {
		System.out.println("study method in PhdStudent class");
	}

	@Override
	void register() {
		System.out.println("register method in PhdStudent class");
	}

	@Override
	void writeThesis() {
		System.out.println("writeThesis method in PhdStudent class");
	}

	@Override
	void meetWithAdvisor() {
		System.out.println("meetWithAdvisor method in PhdStudent class");
	}

	void writePaper() {
		System.out.println("study method in PhdStudent class");
	}

	public boolean getQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

}

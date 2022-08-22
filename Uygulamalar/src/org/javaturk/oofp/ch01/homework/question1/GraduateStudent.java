package org.javaturk.oofp.ch01.homework.question1;

import java.util.Date;

public class GraduateStudent extends Student {

	private String advisor;
	private String thesis;

	public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor) {
		super(no, name, year, dob, major);
		this.advisor = advisor;
	}

	@Override
	void study() {
		System.out.print("study method in GraduateStudent class");
	}

	@Override
	void register() {
		System.out.print("register method in GraduateStudent class");
	}

	void writeThesis() {
		System.out.print("writeThesis method in GraduateStudent class");
	}

	void meetWithAdvisor() {
		System.out.print("meetWithAdvisor method in GraduateStudent class");
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}

}

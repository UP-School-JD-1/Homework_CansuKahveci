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
		System.out.println("study method in GraduateStudent class");
	}

	@Override
	void register() {
		System.out.println("register method in GraduateStudent class");
	}

	void writeThesis() {
		System.out.println("writeThesis method in GraduateStudent class");
	}

	void meetWithAdvisor() {
		System.out.println("meetWithAdvisor method in GraduateStudent class");
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

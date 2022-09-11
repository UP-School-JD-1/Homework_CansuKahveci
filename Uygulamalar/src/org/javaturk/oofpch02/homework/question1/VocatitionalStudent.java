package org.javaturk.oofpch02.homework.question1;

import java.util.Date;

public class VocatitionalStudent extends Student {

	public VocatitionalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}

	@Override
	void study() {
		System.out.println("study method in VocationalStudent class");
	}

	@Override
	void register() {
		System.out.println("register method in VocationalStudent class");
	}

//	Student'daki toStringi kullanmamız yeterli mi? return de dönen bilgilerde farklılık yok çünkü
	@Override
	public String toString() {
		return "Student : " + "\nno = " + no + "\nname = " + name + "\nyear = " + year + "\ndob = " + dob + "\nmajor = "
				+ major;
	}

}

package org.javaturk.oofpch02.homework.question1;

import java.util.Date;

public class RegistrationOfficeTest {
	public static void main(String[] args) {

//		Student student1 = new Student(1, "Barış", 79, new Date(1943, 02, 01), "Conservatoire");
//		Student student2 = new Student(2, "Cem ", 21, new Date(2001, 02, 01), "Industrial Engineering");
//
		GraduateStudent graduateStudent = new GraduateStudent(3, "Cansu", 27, new Date(1994, 8, 23),
				"Mathematical Engineering", "Fatma");
//		MasterStudent masterStudent = new MasterStudent(4, "Tuğçe", 22, new Date(2000, 7, 14), "Industrial Engineering",
//				"Industrial Engineering", "Selin");
//		PhdStudent phdStudent = new PhdStudent(5, "Rafet", 45, new Date(2003, 8, 23), "Mathematical Engineering",
//				"Fatma", true);
//		UndergraduateStudent undergraduateStudent = new UndergraduateStudent(6, "Hatice", 20, new Date(2002, 9, 21),
//				"Mathematical Engineering", "Industrial Engineering");
		VocatitionalStudent vocatitionalStudent = new VocatitionalStudent(7, " Cemile", 23, new Date(1999, 1, 28),
				"physics");
		
//		masterStudent.register();
//		System.out.println(vocatitionalStudent.toString());
		
		RegistrationOffice registrationOffice = new RegistrationOffice();
		
		registrationOffice.registerStudent(vocatitionalStudent);
		registrationOffice.registerStudent(graduateStudent);
		
		System.out.println();
		System.out.println(registrationOffice.getStudent());
		System.out.println(registrationOffice.getStudent());
		System.out.println(registrationOffice.getStudent());
		
	}
}

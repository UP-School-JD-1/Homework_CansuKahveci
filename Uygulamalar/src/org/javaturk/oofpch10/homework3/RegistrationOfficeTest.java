package org.javaturk.oofpch10.homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.BinaryOperator;

public class RegistrationOfficeTest {
	public static void main(String[] args) {

		GraduateStudent graduateStudent = new GraduateStudent(3, "Cansu", 27, new Date(1994, 8, 23),
				"Mathematical Engineering", "Fatma");
		MasterStudent masterStudent = new MasterStudent(4, "Tuğçe", 22, new Date(2000, 7, 14), "Industrial Engineering",
				"Industrial Engineering", "Selin");
		PhdStudent phdStudent = new PhdStudent(5, "Rafet", 45, new Date(2003, 8, 23), "Mathematical Engineering",
				"Fatma", true);
		UndergraduateStudent undergraduateStudent = new UndergraduateStudent(6, "Hatice", 20, new Date(2002, 9, 21),
				"Mathematical Engineering", "Industrial Engineering");

//		masterStudent.register();
//		System.out.println(vocatitionalStudent.toString());

		RegistrationOffice registrationOffice = new RegistrationOffice();

		registrationOffice.registerStudent(graduateStudent);

		System.out.println();
		System.out.println(registrationOffice.getStudent());
		System.out.println(registrationOffice.getStudent());
		System.out.println(registrationOffice.getStudent());
		
		List studentNo = new ArrayList<>();
		studentNo.add(graduateStudent.no);
		studentNo.add(masterStudent.no);
		studentNo.add(phdStudent.no);
		studentNo.add(undergraduateStudent.no);

		Comparator<Student> comparator1 = (std1, std2) -> std1.no - std2.no;
		BinaryOperator<Student> maxNo = BinaryOperator.maxBy(comparator1);
		
		Collections.sort(studentNo);
			}
}

package org.javaturk.oofpch01.homework.question1;

import java.util.Date;

public class RegistrationOffice {

	Student student;

	public RegistrationOffice() {

	}

	Student getStudent() {

		Student student = null;

//		/* rastgele sayılara aralık verme (1 ile 4 arasında) */
		int i = (int) (3 * Math.random() + 1);
		switch (i) {
		case 0:
			student = new GraduateStudent(3, "Cansu", 27, new Date(1994, 8, 23), "Mathematical Engineering", "Fatma");
			break;
		case 1:
			student = new MasterStudent(4, "Tuğçe", 22, new Date(2000, 7, 14), "Industrial Engineering",
					"Industrial Engineering", "Selin");
			break;
		case 2:
			student = new PhdStudent(5, "Rafet", 45, new Date(2003, 8, 23), "Mathematical Engineering", "Fatma", true);
			break;
		case 3:
			student = new UndergraduateStudent(6, "Hatice", 20, new Date(2002, 9, 21), "Mathematical Engineering",
					"Industrial Engineering");
			break;
		case 4:
			student = new VocatitionalStudent(7, " Cemile", 23, new Date(1999, 1, 28), "physics");
			break;
		default:

		}

		return student;
		// upcasting -->student alt tiplerden hanhangi biri olabilir!!!
		// Student s = new UndergraduateStudetn(); referans Student tipinde***
	}

	void registerStudent(Student student) {

//		downcasting yaptık. student tipini masterstudent ve diğer alt tiplere çeviriyoruz
//		Soldaki referans tüm alt tipleri iiçin true döner bu sebeple if-else yapısını özelden genele yazmak gerekiyor!!!

//		  instanceof un devamınada eklemiştim ama hata verdi 
//		  if(student instanceof MasterStudent masterStudent) {
//			 masterStudent.register();		

		if (student instanceof MasterStudent) {
			MasterStudent masterStudent = (MasterStudent) student;
			masterStudent.register();
			System.out.println(masterStudent.name + " is Master Student");

		} else if (student instanceof PhdStudent) {
			PhdStudent phdStudent = (PhdStudent) student;
			phdStudent.register();
			System.out.println(phdStudent.name + " is Phd Student");

		} else if (student instanceof GraduateStudent) {
			GraduateStudent graduateStudent = (GraduateStudent) student;
			graduateStudent.register();
			System.out.println(graduateStudent.name + " is Graduate Student");

		} else if (student instanceof UndergraduateStudent) {
			UndergraduateStudent undergraduateStudent = (UndergraduateStudent) student;
			undergraduateStudent.register();
			System.out.println(undergraduateStudent.name + " is Undergraduate Student");

		} else if (student instanceof Student) {
			student.register();
			System.out.println(student.name + " is a Student");
		} else
			System.out.println("Not Student");
	}

}

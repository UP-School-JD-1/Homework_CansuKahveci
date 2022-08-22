package org.javaturk.oofp.ch01.homework.question1;

public class RegistrationOffice {

	Student student;

	public RegistrationOffice() {

	}

	Student getStudent() {
		// upcasting -->student alt tiplerden hanhangi biri olabilir!!!
		// Student s = new UndergraduateStudetn(); referans Student tipinde***
		return student;
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

		} else if (student instanceof PhdStudent) {
			PhdStudent phdStudent = (PhdStudent) student;
			phdStudent.register();

		} else if (student instanceof GraduateStudent) {
			GraduateStudent graduateStudent = (GraduateStudent) student;
			graduateStudent.register();

		} else if (student instanceof UndergraduateStudent) {
			UndergraduateStudent undergraduateStudent = (UndergraduateStudent) student;
			undergraduateStudent.register();

		} else if (student instanceof Student) {
			student.register();

		} else
			System.out.print("He/She is not Student");
	}

}

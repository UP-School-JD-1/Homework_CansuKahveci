package org.javaturk.oofp.ch01.homework.question1;

public class RegistrationOffice {
// public gerekli mi sınıf tanımında, aynı paketteki class lar erişecek, bu benim arayüzüm mü
	// nasıl anlıcam arayüz olduğunu
	Student student;

	public RegistrationOffice() {

	}

	Student getStudent() {
		return student;
	}

	void registerStudent(Student student) {
		this.student = student;
//		student.register();
	}
	
	
//	Upcasting ve downcasting ile
//	instanceof kullanacak şekilde
//	RegistrationOffice
//	metotlarını yazın.
}

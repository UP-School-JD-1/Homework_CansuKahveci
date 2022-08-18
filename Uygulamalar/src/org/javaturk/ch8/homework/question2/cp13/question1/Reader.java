package org.javaturk.ch8.homework.question2.cp13.question1;

public class Reader {

	private String name;
	private int age;
	private char sex;
	private Book book;

	void read(Book book) {
		if (book.getCurrentPage() > 0) {
			System.out.print(name + " is reading book\n");
		} else
			System.out.print(name + " does not start to read " + book.getTitle() + "yet\n");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
}

package org.javaturk.ch8.homework.question2.cp13.question1;

public class ReaderTest {

	public static void main(String[] args) {

		Reader reader1 = new Reader();
		reader1.setName("Ali");
		
		Author author1 = new Author("Shakira");
		
		Book book1 = new Book("Tepedeki Ev", 223, author1);
		book1.setType("Horror");
		book1.setCurrentPage(25);
		
		book1.setReader(reader1);
		reader1.setBook(book1);
		
		reader1.read(book1);
		book1.BookInfo(book1);
		
		System.out.println();
		
		Author author2 = new Author("Marc Antony");
		Book book2 = new Book(BookType.DETECTIVE_AND_MYSTERY);
		Reader reader2 = new Reader();
		
		System.out.println();
		
		book2.setTitle("Eyes");
		book2.setHardCover(true);
		book2.setCurrentPage(54);
		reader2.setName("Veli");
		reader2.setAge(78);
		reader2.setBook(book2);
		book2.setReader(reader2);
		book2.setAuthor(author2);
		author2.setBook(book2);
		book2.BookInfo(book2);
		
	}

}

package org.javaturk.ch8.homework.question2.cp13.question1;

public class Book {

	private Author author;
	private String title;
	private int page;
	private String type;
	private boolean isHardCover;
	private int currentPage;
	private Reader reader;
	private BookType bookType;

	Book(String title, int page, Author author) {
		this.title = title;
		this.page = page;
		this.author = author;
	}
	Book(BookType bookType){
		this.bookType = bookType;
	}
	
	void BookInfo(Book book) {
		System.out.print("Title : " + title +
				"\nBooks author : " + author.name +
				"\nPage : " + page +
				"\nBookType : " + bookType
				);
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isHardCover() {
		return isHardCover;
	}

	public void setHardCover(boolean isHardCover) {
		this.isHardCover = isHardCover;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

}

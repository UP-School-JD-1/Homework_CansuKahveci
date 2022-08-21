
package org.javaturk.oofp.ch10.stream.book;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Examples0 {
	private static List<String> names = Arrays.asList("Paul", "Jane", "Michael", "Sam", "Pat");

	private static Book book1 = new Book("The Cat in the Hat", "Dr", "Seuss", 45);
	private static Book book2 = new Book("Harry Potter and The Sorcerers Stone", "JK", "Rowling", 411);
	private static Book book3 = new Book("Miss Peregrine's Home for Peculiar Children", "Ranson", "Riggs", 382);

	private static List<Book> books = Arrays.asList(book1, book2, book3);

	public static void main(String[] args) {

		names.forEach(name -> System.out.print(name + " "));

		System.out.println();

		names.stream().filter(name -> name.startsWith("P")).forEach(p -> System.out.println(p + " "));

		System.out.println();

		names.stream().filter(name -> name.startsWith("P")).forEach(p -> System.out.println(p + " " + p.length()));

		System.out.println();

		Predicate<String> stringLen = (s) -> s.length() < 4;
		names.stream().filter(stringLen).forEach(p -> System.out.println(p + " " + p.length()));

		System.out.println();

		Predicate<Book> bookNameLength = (b) -> b.getPages() > 100;
		books.stream().filter(bookNameLength).forEach(b -> System.out.println(b.getTitle() + " " + b.getPages()));

		System.out.println();

		books.stream().forEach(System.out::print);
	}
}

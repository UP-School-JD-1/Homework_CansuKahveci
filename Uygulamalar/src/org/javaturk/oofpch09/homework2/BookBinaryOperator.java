package org.javaturk.oofpch09.homework2;

import java.util.function.*;
import java.util.Comparator;

public class BookBinaryOperator {

	public static void main(String[] args) {

		Book book1 = new Book("İnce Memed","Yasar Kemal", 230);
		Book book2 = new Book("Harry Potter ve Felsefe Tası","J. K. Rowling", 276);
		Book book3 = new Book("Harry Potter ve Sırlar Odası","J. K. Rowling", 314);
		Book book4 = new Book("Harry Potter ve Azkaban Tutsagı","J. K. Rowling", 396);
		
		
//		BinaryOperator’ün maxBy() metodunu ve Comparator’ü
//		kullanarak geçilen iki Book nesnesinden sayfa sayısı daha çok
//		olanı döndürecek şekilde lambda ifadesi olarak gerçekleyin.
		
		Comparator<Integer> comparator1 = (i1, i2) -> i1 - i2;
		BinaryOperator<Integer> maxOperator = BinaryOperator.maxBy(comparator1);
	
		int maxPage1 = maxOperator.apply(book1.getPage(), book2.getPage());
		System.out.println(maxPage1);
		
		int maxPage2 = maxOperator.apply(book3.getPage(), book4.getPage());
		System.out.println(maxPage2);
		
		
		
	}

}

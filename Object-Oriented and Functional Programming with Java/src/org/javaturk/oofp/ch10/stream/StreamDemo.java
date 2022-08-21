
package org.javaturk.oofp.ch10.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	private static List<String> names = Arrays.asList("Metin", "Kamil", "Menekse", "Selim");

	public static void main(String[] args) {
		Stream<String> stream = names.stream();
		System.out.println("Number of elements: " + stream.count());

		System.out.println();

		stream = names.stream();
		stream.forEach((a) -> System.out.println(a));

		System.out.println();

		stream = names.stream();
		stream.forEach(System.out::println);

		System.out.println();

		stream = names.stream();
		stream.forEach(System.out::println);

	}

}

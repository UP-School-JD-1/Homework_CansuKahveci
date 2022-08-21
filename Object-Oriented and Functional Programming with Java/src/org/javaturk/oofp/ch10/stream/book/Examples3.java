
package org.javaturk.oofp.ch10.stream.book;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Examples3 {

	public static void main(String[] args) {
		IntStream.range(1, 4).forEach(System.out::println);

		System.out.println();
		
		// find the average of the even numbers squared
		Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }).filter(x -> x % 2 == 0).map(n -> n * n).average().ifPresent(System.out::println);

		System.out.println();
		
		// map doubles to ints
		Stream.of(1.5, 2.3, 3.7).mapToInt(Double::intValue).forEach(System.out::println);
	}
}

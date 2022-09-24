package org.javaturk.oofpch09.homework1;

import java.util.function.*;

public class EvenNumberOperations {

//	Function<Integer, Boolean> EvenNumberOperation = number -> number % 2 == 0;

	public void doEvenNumberOperation(Function function, int n) {
		if (n % 2 == 0)
//			System.out.println(function.apply(n));
			System.out.println(function.apply(n));
	}
//		System.out.println(function.apply(productFunction));
//		System.out.println(function.apply(sumFunction));
//		System.out.println(function.apply(squareFunction));

}

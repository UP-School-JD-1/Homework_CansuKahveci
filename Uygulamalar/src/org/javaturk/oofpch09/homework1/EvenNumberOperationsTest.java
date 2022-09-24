package org.javaturk.oofpch09.homework1;

import java.util.function.Function;

public class EvenNumberOperationsTest {
	 static int sum = 0;
	 static int product = 1;
	public static void main(String[] args) {
		


		EvenNumberOperations Eno = new EvenNumberOperations();
		
		Function<Integer, Integer> productFunction = i -> product*= i;
		Function<Integer, Integer> sumFunction = i -> sum *= i;
		Function<Integer, Integer> squareFunction = i -> i * i;
		
		
		Eno.doEvenNumberOperation(productFunction, 5);
		Eno.doEvenNumberOperation(sumFunction, 5);
		Eno.doEvenNumberOperation(squareFunction, 7);


	}

}

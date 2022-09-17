package org.javaturk.oofpch03.homework4;

public class FibonacciFunction implements MathFunction {

	private static String name = "Fibonacci";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg) {

		if (arg == 0) {
			return 0;
		} else if (arg == 1) {
			return 1;
		} else {
			System.out.print(arg-1);
			return calculate(arg - 1) + calculate(arg - 2);
		}

	}

}

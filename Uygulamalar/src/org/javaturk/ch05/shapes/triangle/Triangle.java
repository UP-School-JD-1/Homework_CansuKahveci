package org.javaturk.ch05.shapes.triangle;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle = new Triangle();
		triangle.drawRightTriangle(8, 10);

	}

	public void drawRightTriangle(int row, int column) {
		// a x a lik bir dik üçgen çiziyor
		for (int i = 0; i <= row; i++) {
			System.out.print("*");
			for (int j = 0; j < column; j++) {
				if (i > j) {
					System.out.print("*");
					if (j == column - 1) {
						System.out.println();
					}

				}

			}

			System.out.println();

		}

	}

	public void drawTriangle(int row, int column) {

	}

}

package org.javaturk.ch05.shapes.rectangle;

public class Rectangle {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();

		rectangle.drawFilledRectangle(5, 4);
		rectangle.drawVoidRectangle(5, 4);

		// TODO Auto-generated method stub

	}

	public void drawFilledRectangle(int row, int column) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("*");

				if (j == column - 1) {
					System.out.println();

				}
			}
		}

	}

	public void drawVoidRectangle(int row, int column) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || i == row - 1) {
					System.out.print("*");
					if (j == column - 1) {
						System.out.println();
					}

				} else {
					if (j == 0) {
						System.out.print("*");
					} else if (j == column - 1) {
						System.out.println("*");
					} else {
						System.out.print(" ");
					}
				}

			}

		}

	}
	// son kolonda ise hep aşağıya indiği için kod tektarı yapmadan da yazılabilir
	// if(j == column - 1 ) { System.out.println(); direk dfor içine yazıp else
	// durumunu güncelleyebiliriz

}

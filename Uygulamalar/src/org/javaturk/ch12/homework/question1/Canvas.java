//Canvas diye bir başka sınıf oluşturun ve üzerine Shape alan,
//drawShape(Shape s) ve eraseShape(Shape s) metotlarını
//koyun.

package org.javaturk.ch12.homework.question1;

public class Canvas extends Shape {

	public Canvas() {
		super();
	}
	void drawShape(Shape s) {
		System.out.print(s + "shape was draw");
	};

	void eraseShape(Shape s) {
		System.out.print(s + "shape was erased");
	};

}

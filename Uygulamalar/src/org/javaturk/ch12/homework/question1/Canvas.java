//Canvas diye bir başka sınıf oluşturun ve üzerine Shape alan,
//drawShape(Shape s) ve eraseShape(Shape s) metotlarını
//koyun.

package org.javaturk.ch12.homework.question1;

public class Canvas extends Shape {

	public Canvas() {
		super();
	}
	void drawShape(Shape s) {
		
		if(s instanceof Circle c) {
			c.toString();
			System.out.println("Shape is Circle");
		}else if(s instanceof Rectangle r) {
			r.toString();
			System.out.println("Shape is Rectangle");
		}else if(s instanceof Triangle t) {
			t.toString();
			System.out.println("Shape is Triangle");
		}else if(s instanceof Square square) {
			square.toString();
			System.out.println("Shape is Square");
		}else {
			System.out.println("It is not shape");
		}
	
	};

	void eraseShape(Shape s) {
		System.out.print(s + "shape was erased");
	};

}

package org.javaturk.ch06.application;

public class Main {

	public static void main(String[] args) {

		Pizza pizza = new Pizza();
		pizza.name = "Margarita";
		pizza.size = "Middle";
		pizza.price = 68.99;
		pizza.ingredients = new String[2];
		pizza.ingredients[0] = "Mozerella";

		System.out.print(pizza.name);
	}
}

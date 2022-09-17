package org.javaturk.oofpch03.homework2;

public class Engineer extends Person {

	String branch;

	Engineer(String name, String lastName, int age, String branch) {
		super(name, lastName, age);
		this.branch = branch;
	}

}

package org.javaturk.oofpch10.homework1;

import java.util.Collection;
import java.util.List;

public class Person {

	private String name;
	private String lastName;
	private List address;
	private int number;

	public Person(String name, String lastName, List address, int number) {
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.number = number;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<String>[] getAddress() {
		return address;
	}

	public void setAddress(List<String>[] address) {
		this.address = address;
	}

	public List<Integer>[] getNumber() {
		return number;
	}

	public void setNumber(List<Integer>[] number) {
		this.number = number;
	}

}

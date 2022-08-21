/*
 * ComparableExample2.java
 */

package org.javaturk.oofp.ch10.algorithm;

import java.util.*;

public class SortingExample1 {
	public static void main(String[] args) {
		List<Name> list = new ArrayList<Name>();
		
		Name name1 = new Name("Ali", "Ulucan");
		list.add(name1);
		Name name2 = new Name("Zeynep", "Kemal");
		list.add(name2);
		Name name3 = new Name("Husamettin", "Kemal");
		list.add(name3);
		Name name4 = new Name("Ali Kemal", "Terzioglu");
		list.add(name4);
		
		System.out.println("Unsorted list is " + list);
		Collections.sort(list);
		System.out.println("Sorted list is " + list);
	}
}

class Name implements Comparable {
	private String firstName, lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String toString() {
		return firstName + " " + lastName;
	}

	public int compareTo(Object o) {
		Name n = (Name) o;
		int lastCmp = lastName.compareTo(n.lastName);
		return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
	}
	
//	public int compareTo(Object o) {
//		Name n = (Name) o;
//		String fullName = firstName + lastName;
//		String otherFullName = n.firstName + n.lastName;
////		System.out.println(otherFullName.length() - fullName.length());
//		return (otherFullName.length() - fullName.length());
//	}
}

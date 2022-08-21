/*
 * ListGateway.java
 */

package org.javaturk.oofp.ch10.list;

import java.util.*;

public class ListGateway {
	public static void main(String[] args) {

		String[] array = new String[] { "Hit List", "To Do List", "Mailing List", "Price List", "Top Ten List" };

		List list = Arrays.asList(array);

		// List list = new ArrayList(100);
//		 list.add(3);
		// list.add("akin");
		// list.add(3);
		// list.add("veli");

		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();

		for (Object o : list)
			System.out.println(o);

		System.out.println();
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		 
//		list.add("Last List"); // Run time error:
//		 java.lang.UnsupportedOperationException

		System.out.println();

		System.out.println(list.contains("akin"));
		System.out.println(list.get(3));
		System.out.println(list.indexOf(3));
		System.out.println(list.lastIndexOf(3));
	}
}


package org.javaturk.oofp.ch10.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		List list = new ArrayList();  // Change it to LinkedList to see if there is any effect!
		list.add(3);
		list.add("Akin");
		list.add(3);
		list.add("Veli");
		list.add("Televizyon");
		list.add(new Date());

		System.out.println(list.contains("Akin"));
		System.out.println(list.get(3));
		System.out.println(list.indexOf(3));
		System.out.println(list.lastIndexOf(3));
		
		System.out.println(list.set(1, "Mustafa"));
		System.out.println(list.contains("Akin"));
		
		System.out.println("Iterating the list through a for loop:");
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();
		
		list.add(3, "Zeynep");
		
		System.out.println("Iterating the list through an iterator:");
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		System.out.println("Iterating forward:");
		ListIterator listIter = list.listIterator();
		while (listIter.hasNext()) {
			System.out.println(listIter.nextIndex() + ": " + listIter.next());
		}
		System.out.println();
		
		System.out.println("Iterating backward:");
		while (listIter.hasPrevious()) {
			System.out.println(listIter.previousIndex() + ": " + listIter.previous());
		}
	}
}

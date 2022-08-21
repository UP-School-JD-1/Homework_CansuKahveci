package org.javaturk.oofp.ch10.commons;

import java.util.Iterator;

import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.HashBag;

public class BagExample {
	public static void main(String[] args) {

		Bag bag = new HashBag();
		bag.add("TEST1", 100);
		bag.add("TEST2", 500);
		int test1Count1 = bag.getCount("TEST1");
		int test2Count1 = bag.getCount("TEST2");
		System.out.println("Counts: TEST1: " + test1Count1 + ", TEST2: " + test2Count1);
		bag.remove("TEST1", 91);
		bag.remove("TEST2", 490);
		int test1Count2 = bag.getCount("TEST1");
		int test2Count2 = bag.getCount("TEST2");
		System.out.println("Counts: TEST1: " + test1Count2 + ", TEST2: " + test2Count2);
		
		Iterator i = bag.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}

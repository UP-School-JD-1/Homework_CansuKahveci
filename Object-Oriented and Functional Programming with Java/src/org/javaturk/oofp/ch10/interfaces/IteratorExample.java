
package org.javaturk.oofp.ch10.interfaces;

import java.util.Collection;
import java.util.Iterator;

import org.javaturk.oofp.ch10.util.CollectionUtil;

public class IteratorExample {

	public static void main(String[] args) {

		Collection coll = CollectionUtil.getCollection();
		System.out.println("Collection: " + coll);

//		coll.add("twenty"); // No problem with that!

		System.out.println("Include \"twenty\": " + coll.contains("twenty"));

		Iterator it = coll.iterator();

		coll.add("twenty five");
//		coll.remove("twenty five");
		System.out.println("\nIterating");
		
		while (it.hasNext()){
			Object o = it.next();
			String s = (String) o;
			System.out.println("Element: " + s);
			if(s.startsWith("o"))
				it.remove();
		}
		
		coll.add("twenty six"); 
		
		System.out.println();
		
		System.out.println("Iterating one more time");
		it = coll.iterator();
		while (it.hasNext()){
			Object o = it.next();
			String s = (String) o;
			System.out.println(s);
		}

		 coll.add("twenty five"); // Comment out this line to make it run
		// correctly!
		// coll.remove("twenty");
//		 it.next();
//
		// while (it.hasNext()) {
		// System.out.println(it.next());
		// if(((String)it.next()).startsWith("t"))
		// coll.add("xXXXX");
		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());
		// it.remove();

		// }

		// while (it.hasNext())
		// System.out.println("BURADA: " + it.next());
//		if (it != null)
//			System.out.println("Iterator: " + it);
//		else
//			System.out.println("NULLLLL :(");

		coll.add("x");
		// System.out.println("BURADA: " + it.next());
		coll.add("y");

		System.out.println("After iteration.");
		System.out.println("Collection: " + coll);

		coll.remove("y");

		System.out.println("After iteration.");
		System.out.println("Collection: " + coll);
	}

}

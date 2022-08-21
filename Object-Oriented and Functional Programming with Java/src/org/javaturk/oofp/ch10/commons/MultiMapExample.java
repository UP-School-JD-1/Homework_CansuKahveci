package org.javaturk.oofp.ch10.commons;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.MultiMap;

public class MultiMapExample {

	public static void main(String[] args) {
		MultiMap map = new MultiHashMap();
		map.put("ONE", "TEST");
		map.put("ONE", "HELLO");
		map.put("ONE", "CAR");
		map.put("TWO", "PICNIC");
		map.put("TWO", "TELEVISION");
		map.put("TWO", "TESTIMONY");
		Set keySet = map.keySet();

		Iterator keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			Object key = keyIterator.next();
			System.out.print("Key: " + key + ", ");
			Collection values = (Collection) map.get(key);
			Iterator valuesIterator = values.iterator();
			System.out.print("Its values: ");
			while (valuesIterator.hasNext()) {
				System.out.print(valuesIterator.next() + " ");
			}
			System.out.println();
		}
	}
}

package org.javaturk.oofp.ch10.commons;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.bidimap.TreeBidiMap;

public class BidirectionalMap {


	public static void main(String[] args) {
		BidiMap names = new TreeBidiMap();
		names.put("a", "Ali");
		names.put("b", "Betul");
		names.put("c", "Cihan");
		names.put("k", "Kemal");
		names.put("k", "Cihan");
		
		System.out.println("Value: " + names.get("k"));
		System.out.println("Key: " + names.getKey("Cihan"));

	}
}

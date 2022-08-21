
package org.javaturk.oofp.ch10.list;

import java.util.List;
import java.util.function.Predicate;

import org.javaturk.oofp.ch10.util.CollectionUtil;

public class ListPredicateExample {

	public static void main(String[] args) {
		Predicate<String> stringLengthPredicate1 = (s) -> {
			if (s.length() > 5)
				return true;
			else
				return false;
		};
		
		Predicate<String> stringLengthPredicate2 = (s) -> s.length() > 5;
		
		List<String> list = CollectionUtil.getList();
		System.out.println(list);
		list.removeIf(stringLengthPredicate2);
		System.out.println(list);
	}
}

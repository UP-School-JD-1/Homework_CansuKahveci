
package org.javaturk.oofp.ch10.interfaces;

import java.util.Comparator;

import org.javaturk.oofp.ch10.domain.Employee;
import org.javaturk.oofp.ch10.domain.EmployeeComparator;

/**
 * @author akin
 *
 */
public class ComparatorExample {

	public static void main(String[] args) {
		Employee e1 = new Employee(111, "Mihrimah", "Kaldiroglu", 1);
		Employee e2 = new Employee(222, "Ali", "Can", 3);
		
		EmployeeComparator ec = new EmployeeComparator();
		
		System.out.println("Compare e1 to e2: " + ec.compare(e1, e2));
		System.out.println("Compare e2 to e1: " + ec.compare(e2, e1));
		
		Comparator reversedEc = ec.reversed(); 
		System.out.println("Compare e1 to e2: " + reversedEc.compare(e1, e2));
		System.out.println("Compare e2 to e1: " + reversedEc.compare(e2, e1));
	}
}

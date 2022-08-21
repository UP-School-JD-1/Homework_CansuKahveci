/*
 * ComparableExample.java
 */

package org.javaturk.oofp.ch10.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.javaturk.oofp.ch10.domain.Employee;
import org.javaturk.oofp.ch10.domain.EmployeeComparator;

public class TreeSetExample {
	public static void main(String[] args) {

		Set set = new TreeSet(new EmployeeComparator());

		Employee e1 = new Employee(111, "Akin", "Kaldiroglu");
		set.add(e1);
		Employee e2 = new Employee(222, "Ali", "Can");
		set.add(e2);
		Employee e3 = new Employee(888, "Ayse", "Unlu");
		set.add(e3);
		Employee e4 = new Employee(223, "Sami", "Mutlu");
		set.add(e4);
		Employee e5 = new Employee(222, "Ali", "Can");
		System.out.println(set.add(e5));

		Iterator i = set.iterator();
		while (i.hasNext()) {
			Employee e = (Employee) i.next();
			System.out.println(e.getNo() + " " + e.getFirstName() + " " + e.getLastName());
		}
	}
}

//class Employee {
//	int no;
//	String name;
//	String lastName;
//
//	public Employee(int no, String name, String lastName) {
//		this.no = no;
//		this.name = name;
//		this.lastName = lastName;
//	}

//	@Override
//	public int hashCode() {
//		System.out.println("hashCode()");
//		return no;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("equals()");
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (no != other.no)
//			return false;
//		return true;
//	}

//	@Override
//	public int compareTo(Object o) {
//		Employee other = (Employee) o;
//		int result = 0;
//		if(no == other.no)
//			result = 0;
//		else if (no < other.no)
//			result = -1;
//		else
//			result = 1;
//		return result;
//	}
	
//	@Override
//	public int compareTo(Object o) {
//		
//		Employee other = (Employee) o;
//		System.out.println("compareTo(): " + lastName + " compared to " + other.lastName );
//		return lastName.compareTo(other.lastName);
//	}
//}

//class EmployeeComparator implements Comparator {
//
//	@Override
//	public int compare(Object arg0, Object arg1) {
//		Employee e1 = (Employee) arg0;
//		Employee e2 = (Employee) arg1;
//
//		if (e1.no < e2.no)
//			return -1;
//		else if (e1.no == e2.no)
//			return 0;
//		else
//			return 1;
//	}
//	
////	@Override
////	public int compare(Object arg0, Object arg1) {
////		Employee e1 = (Employee) arg0;
////		Employee e2 = (Employee) arg1;
////
////		return e1.lastName.compareTo(e2.lastName);
////	}
//}

package org.javaturk.oofpch10.homework1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class PersonTest {

	public static void main(String[] args) {

		List address1 = new ArrayList();
		address1.add("Mersin");
		address1.add("İstanbul");

		List address2 = new ArrayList();
		address2.add("İzmir");
		address2.add("İstanbul");
		
		List address3 = new ArrayList();
		address3.add("Bolu");
		

		Person person1= new Person("Cansu", "Kahveci",address1,531531531);
		Person person2= new Person("Merve", "Kahveci",address2,532532532);
		Person person3= new Person("Ayşe", "Taş",address3,533533533);
		
		TreeSet<Person> listOfPerson = new TreeSet();
		listOfPerson.add(person1);
		listOfPerson.add(person2);
		listOfPerson.add(person3);
		
//		for (Person person : listOfPerson)
//			System.out.println(person);
		
		
//		Comparator<Person> compareByName = (p1, p2) -> p1.getName().compareTo(p2.getName());
//		Collections.sort(listOfPerson, compareByName);
//		for(Person person : listOfPerson)
//			System.out.print(listOfPerson);
	}

}

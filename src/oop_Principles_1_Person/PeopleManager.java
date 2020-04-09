package oop_Principles_1_Person;

import java.util.ArrayList;
import java.util.List;

public class PeopleManager {

	public List<Person> people = new ArrayList<>();

	public boolean addPerson(Person p) {
		return this.people.add(p);
	}

	public Person findPerson(String name) {
		for (Person p : people) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}

	//how to print off array?
//	public Person streamer() {
//		// Stream<>.Person
//		public List<Person> printIt = people.stream().collect(p.toList());
//		System.out.println(printIt);
	}

}

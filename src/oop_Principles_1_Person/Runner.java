package oop_Principles_1_Person;

public class Runner {

	public static void main(String[] args) {

		PeopleManager pList = new PeopleManager();

		pList.people.add(new Person(34, "Bary", "Plumber"));
		pList.people.add(new Person(27, "Sarah", "Accountant"));

//		System.out.println(pList.people.forEach(p));

//		PeopleManager pList = new PeopleManager();

//		Person p1 = new Person(34, "Bary", "Plumber");
//		Person p2 = new Person(27, "Sarah", "Accountant");

//		System.out.println(p1.Returner());
//		System.out.println(p2.Returner());
	}
}

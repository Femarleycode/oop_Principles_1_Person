package oop_Principles_1_Person;

public class Person {

//	public Person() {
//		super();
//	}

	public Person(int age, String name, String jobTitle) {
		super();
		this.age = age;
		this.name = name;
		this.jobTitle = jobTitle;
	}

	private int age;
	private String name;
	private String jobTitle;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String Returner() {
		String allInfo = name + "" + age + jobTitle;
		return allInfo;
	}

}
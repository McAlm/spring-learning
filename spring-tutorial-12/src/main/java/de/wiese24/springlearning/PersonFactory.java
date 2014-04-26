package de.wiese24.springlearning;

public class PersonFactory {

	public Person createPerson(int id, String name) {
		return new Person(id, name);
	}
}

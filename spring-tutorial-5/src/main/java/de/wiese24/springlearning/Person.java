package de.wiese24.springlearning;

public class Person {

	private int id;
	private String name;
	private int taxId;

	private Address address;

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Person() {

	}

	public void init() {
		System.out.println("Person created  " + this.toString());
	}

	/**
	 * destroy method will only be called if scope is singleton
	 */
	public void onDestroy() {
		System.out.println("Person object destroyed " + this.id);
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void speak() {
		System.out.println("Hello, I'm a Person");
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", address=" + address + "]";
	}

}

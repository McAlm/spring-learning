package de.wiese24.springlearning;

public class Address {
	private String street;
	private String postcode;
	private String city;

	public Address(String street, String postcode, String city) {
		super();
		this.street = street;
		this.postcode = postcode;
		this.city = city;
	}

	public void onCreate() {
		System.out.println("Address bean created " + this.toString());
	}
	
	
	public void onDestroy(){
		System.out.println("Address bean destroyed");
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode
				+ ", city=" + city + "]";
	}

}

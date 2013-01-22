package main;

public class Customer {
	private String character;
	private String name;
	private String address;
	protected int annual_billing;
	
	public Customer(String character, String name, String address,
			int annual_billing) {
		super();
		this.character = character;
		this.name = name;
		this.address = address;
		this.annual_billing = annual_billing;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAnnual_billing() {
		return annual_billing;
	}

	public void setAnnual_billing(int annual_billing) {
		this.annual_billing = annual_billing;
	}
	
	
	
	
}

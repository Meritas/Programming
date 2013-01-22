package main;

public class PremiumCustomer extends Customer implements Discountable {

	public PremiumCustomer(String character, String name, String address,
			int annual_billing) {
		super(character, name, address, annual_billing);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void discount() {
		// TODO Auto-generated method stub
		this.annual_billing /= 2; 
	}

}

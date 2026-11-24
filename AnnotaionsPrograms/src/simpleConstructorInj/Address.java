package simpleConstructorInj;

public class Address {
	int plotNo;
	String city;
	String street;
	int pinCode;
	
	
	public Address(int plotNo, String city, String street, int pinCode) {
		super();
		this.plotNo = plotNo;
		this.city = city;
		this.street = street;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return " [plotNo=" + plotNo + ", city=" + city + ", street=" + street + ", pinCode=" + pinCode + "]";
	}
	
	
	
	
}

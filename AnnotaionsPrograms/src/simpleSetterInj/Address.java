package simpleSetterInj;

public class Address {
	int plotNo;
	String city;
	String street;
	int pinCode;
	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return " [plotNo=" + plotNo + ", city=" + city + ", street=" + street + ", pinCode=" + pinCode + "]";
	}
	
	
	
	
}

package T2.sharedPackage.Address;

public class Address implements IAddress{

	private String streetName;
	private String streetNumber;
	private String postalCode;
	private String city;
	
	
	public Address(String streetName, String streetNumber, String postalCode, String city) {
		super();
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.postalCode = postalCode;
		this.city = city;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getStreetNumber() {
		return streetNumber;
	}


	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	
	public String toString() {
		return "Address [streetName=" + streetName + ", streetNumber=" + streetNumber + ", postalCode=" + postalCode
				+ ", city=" + city + "]";
	}


	public Address getAddress() {
		// TODO Auto-generated method stub
		return null;
	}
}

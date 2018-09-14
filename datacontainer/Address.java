package datacontainer;

public class Address {
	private String Street;
	private String city;
	private String state;
	
	
	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	private String zip;
	private String country;
	
	public Address(String Street, String city, String state, String zip, String country){
		this.Street = Street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
}

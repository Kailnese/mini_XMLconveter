package datacontainer;


public class Customer {
	private business business;
	private residential residential;
	public Customer(String customerCode,String cutomerType, Person contact, String customerName, Address address){
		if(cutomerType.equals("B")){
			business b = new business(customerCode, contact, customerName, address);
			this.business = b;
		}else if(cutomerType.equals("R")){
			residential r = new residential(customerCode, contact, customerName, address);
			this.residential = r;
		}
	}
}
class business{
	private String customerCode;
	private Person contact;
	private Address address;
	private String customerName;
	public business(String customerCode, Person contact, String customerName, Address address){
		this.customerCode = customerCode;
		this.contact = contact;
		this.address = address;
		this.customerName = customerName;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public Person getContact() {
		return contact;
	}
	public void setContact(Person contact) {
		this.contact = contact;
	}
}
class residential{
	private String customerCode;
	private Person contact;
	private Address address;
	private String customerName;
	public residential(String customerCode, Person contact, String customerName, Address address){
		this.customerCode = customerCode;
		this.contact = contact;
		this.address = address;
		this.customerName = customerName;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public Person getContact() {
		return contact;
	}
	public void setContact(Person contact) {
		this.contact = contact;
	}
}
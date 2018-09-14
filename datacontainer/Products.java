package datacontainer;

public class Products {
	private equipment Equipment;
	private consultation Consultation;
	private service Service;
	
	public Products(String code, String productType, String name, String price1, String price2, Person p){
		if(productType.equals("E")){
			equipment equip = new equipment(code, name, price1);
			this.Equipment =equip;
		}else if(productType.equals("S")){
			service service = new service(code, name, price1, price2);
			this.Service = service;
		}else if(productType.equals("C")){
			consultation con = new consultation(code, name, price2, p);
			this.Consultation = con;
		}
	}
	public equipment getEquip() {
		return Equipment;
	}

	public void setEquip(equipment equip) {
		this.Equipment = equip;
	}

	public consultation getCon() {
		return Consultation;
	}

	public void setCon(consultation con) {
		this.Consultation = con;
	}

	public service getSer() {
		return Service;
	}

	public void setSer(service ser) {
		this.Service = ser;
	}

	
}	
class equipment{
	private String productCode;
	private String productName;
	private String price;
	private int units;

	public equipment(String code, String name, String price1){
		this.productCode = code;
		this.productName = name;
		this.price = price1;
		this.units=0;
	}
	public String getCode() {
		return productCode;
	}
	public void setCode(String code) {
		this.productCode = code;
	}
	public String getName() {
		return productName;
	}
	public void setName(String name) {
		this.productName = name;
	}
	public String getPrice1() {
		return price;
	}
	public void setPrice1(String price1) {
		this.price = price1;
	}
}
class consultation{
	private String productCode;
	private String productName;
	private String hourlyFee;
	private Person consultant;
	public consultation(String code, String name, String price2, Person person){
		this.productCode = code;
		this.productName = name;
		this.hourlyFee = price2;
		this.consultant = person;
	}
	public String getCode() {
		return productCode;
	}
	public void setCode(String code) {
		this.productCode = code;
	}
	public String getName() {
		return productName;
	}
	public void setName(String name) {
		this.productName = name;
	}
	public String getPrice1() {
		return hourlyFee;
	}
	public void setPrice1(String price1) {
		this.hourlyFee = price1;
	}
	public Person getPerson() {
		return consultant;
	}
	public void setPerson(Person person) {
		this.consultant = person;
	}
	
}
class service{
	private String code;
	private String name;
	private String activationFee;
	private String annualFee;
	private String startDate;
	private String endDate;
	public service(String code, String name, String price1, String price2){
		this.code = code;
		this.name = name;
		this.activationFee = price1;
		this.annualFee = price2;
		this.startDate = "2016-24-31";
		this.endDate = "2016-24-31";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice1() {
		return activationFee;
	}
	public void setPrice1(String price1) {
		this.activationFee = price1;
	}
	public String getPrice2() {
		return annualFee;
	}
	public void setPrice2(String price2) {
		this.annualFee = price2;
	}
	
}
package fileReader;

import java.util.*;
import java.io.*;
import datacontainer.*;

public class FlatFileReader {
	private ArrayList<Person> personList;
	private ArrayList<Products> productList;
	private ArrayList<Customer> cutomerList;
	public ArrayList<Person> readPersons() throws FileNotFoundException{
		Scanner scan = new Scanner(new File("data/Persons.dat"));
		personList = new ArrayList<Person>();
		scan.nextLine();
		while(scan.hasNextLine()){
			String line = scan.nextLine();
			String[] split = line.split(";");
			String[] name = split[1].split(",");
			String[] addre = split[2].split(",");
			ArrayList<String> email = new ArrayList<String>();
			if(split.length==4){
			String[] mail = split[3].split(",");
			for(int i=0; i<mail.length; i++){
				email.add(mail[i]);
			}
			}
			String firstname = name[1];
			String lastname = name[0];
			Address address = new Address(addre[0], addre[1], addre[2], addre[3], addre[4]);
			Person person = new Person(split[0], firstname, lastname, address, email);
			personList.add(person);
		}
		return personList;
	}
	public ArrayList<Products> readProducts() throws FileNotFoundException{
		Scanner scan = new Scanner(new File("data/Products.dat"));
		productList = new ArrayList<Products>();
		scan.nextLine();
		while(scan.hasNextLine()){
			String line = scan.nextLine();
			String[] split = line.split(";");
			if(split.length>1){
				if(split.length==5 && split[1].equals("C")){
					for(int i=0; i<personList.size(); i++){
						if(personList.get(i).getPersonCode().equals(split[3])){
							Products product = new Products(split[0], split[1], split[2], "-", split[4], personList.get(i));
							productList.add(product);
						}
					}
					
				}else if(split.length==4){
					Products product = new Products(split[0], split[1], split[2], split[3], null, null);
					productList.add(product);
				}else if(split.length==5 && split[1].equals("S")){
					Products product = new Products(split[0], split[1], split[2], split[3], split[4], null);
					
					productList.add(product);
				}
			}else{
				break;
			}
		}
		return productList;
	}
	public ArrayList<Customer> readCustomer() throws FileNotFoundException{
		Scanner scan = new Scanner(new File("data/Customers.dat"));
		cutomerList = new ArrayList<Customer>();
		scan.nextLine();
		while(scan.hasNextLine()){
			String line = scan.nextLine();
			String[] split = line.split(";");
			if(split.length>1){
			String[] addre = split[4].split(",");
			Address address = new Address(addre[0], addre[1], addre[2], addre[3], addre[4]);
			for(int i=0; i<personList.size(); i++){
				if(personList.get(i).getPersonCode().equals(split[2])){
					Customer customer = new Customer(split[0], split[1], personList.get(i), split[3], address);
					cutomerList.add(customer);
				}
			}
			}else{
				break;
			}
		}
		return cutomerList;
	}
}

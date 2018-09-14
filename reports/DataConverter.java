package reports;

import java.io.FileNotFoundException;
import java.util.List;

import datacontainer.*;
import fileReader.*;
import fileWriter.JsonWriter;
import fileWriter.XMLWriter;

public class DataConverter {
public static void main(String[] args) throws FileNotFoundException {
		
		FlatFileReader fr = new FlatFileReader();
		
		List<Person> personList = fr.readPersons();
		List<Customer> customerList = fr.readCustomer();
		List<Products> productList = fr.readProducts();
		
		 XMLWriter xmlWriter = new XMLWriter();
	     xmlWriter.xmlConverter(personList, customerList, productList);
	     
	     JsonWriter jWriter = new JsonWriter();
	     jWriter.jsonConverter(personList, customerList, productList);
	}
}

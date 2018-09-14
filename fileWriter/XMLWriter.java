package fileWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import datacontainer.*;
import com.thoughtworks.xstream.XStream;

public class XMLWriter {

	public void xmlConverter(List<Person> persons, List<Customer> customer, List<Products> products) {
		XStream xstream1 = new XStream();
		XStream xstream2 = new XStream();
		XStream xstream3 = new XStream();
		
        File xmlOutput1 = new File("data/Persons.xml");
        File xmlOutput2 = new File("data/Customers.xml");
        File xmlOutput3 = new File("data/Products.xml");
		
		PrintWriter xmlPrintWriter1 = null;
		PrintWriter xmlPrintWriter2 = null;
		PrintWriter xmlPrintWriter3 = null;
		try {
			xmlPrintWriter1 = new PrintWriter(xmlOutput1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try	{
			xmlPrintWriter2 = new PrintWriter(xmlOutput2);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			xmlPrintWriter3 = new PrintWriter(xmlOutput3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter1.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		xmlPrintWriter2.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		xmlPrintWriter3.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		xstream1.alias("person", Person.class); 
		xstream2.alias("Customer", Customer.class);
		xstream3.alias("Products", Products.class);
		for(Person aPerson : persons) {
			// Use toXML method to convert Person object into a String
			String personOutput = xstream1.toXML(aPerson);
			xmlPrintWriter1.write(personOutput);
		}
		for(Customer aCustomer : customer){
			String personOutput = xstream2.toXML(aCustomer);
			xmlPrintWriter2.write(personOutput);
		}
		for(Products aProducts : products){
			String personOutput = xstream3.toXML(aProducts);
			xmlPrintWriter3.write(personOutput);
		}
		xmlPrintWriter1.close();	
		xmlPrintWriter2.close();
		xmlPrintWriter3.close();
	}
}
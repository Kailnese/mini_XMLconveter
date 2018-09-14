package fileWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import datacontainer.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonWriter {
	
	public void jsonConverter(List<Person> persons, List<Customer> customer, List<Products> product) {
		
		//Gson gson = new Gson();
		Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
		Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
		Gson gson3 = new GsonBuilder().setPrettyPrinting().create();
		File jsonOutput1 = new File("data/Persons.json");
		File jsonOutput2 = new File("data/Customers.json");
		File jsonOutput3 = new File("data/Products.json");
		
		PrintWriter jsonPrintWriter1 = null;
		PrintWriter jsonPrintWriter2 = null;
		PrintWriter jsonPrintWriter3 = null;
		
		try {
			jsonPrintWriter1 = new PrintWriter(jsonOutput1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		try {
			jsonPrintWriter2 = new PrintWriter(jsonOutput2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		try {
			jsonPrintWriter3 = new PrintWriter(jsonOutput3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		for(Person aPerson : persons) {
			// Use toJson method to convert Person object into a String
			String personOutput = gson1.toJson(aPerson); 
			jsonPrintWriter1.write(personOutput + "\n");
		}
		for(Customer aCustomer : customer) {
			// Use toJson method to convert Person object into a String
			String personOutput = gson2.toJson(aCustomer); 
			jsonPrintWriter2.write(personOutput + "\n");
		}
		for(Products aProducts : product) {
			// Use toJson method to convert Person object into a String
			String personOutput = gson3.toJson(aProducts); 
			jsonPrintWriter3.write(personOutput + "\n");
		}
		jsonPrintWriter1.close();
		jsonPrintWriter2.close();
		jsonPrintWriter3.close();
	}
}

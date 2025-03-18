package testPackage;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.DataUtilities;

public class DataSupply {
	
	
	@DataProvider(name = "userCreadentials")
	public Object[][] userData() {
		
		return new Object[][] {
			
			{"resbin@gmail.com", "resbin@123"},
			{"siva@gmail.com", "siva@123"},
			{"sreekanth@gmail.com", "sreekanth@123"},
			{"athulya@gmail.com", "athulya@123"}
		};
	}
	
	@DataProvider(name = "userCreadentials1")
	public Object[][] userData1() {
		
		return new Object[][] {
			
			{"sneha@gmail.com", "sneha@123"},
			{"helen@gmail.com", "helen@123"},
			{"pious@gmail.com", "pious@123"},
			{"hari@gmail.com", "hari@123"}
		};
	}
	
	
	
	@DataProvider(name = "ContactDetails")
	public Object[][] contactData(){
		
		
		return new Object[][] {
			{"Mr.", "Anirudhan", "K", "Employee", "Health Inspector", "Health", "aniridhan@gmail.com", "9922334467"},
			{"Ms.", "Molly", "Joshy", "Self Generated","Journalist", "ALL India Radio", "mollycr@gmail.com", "9988316724"},
			{"Mr.", "Abhinand", "Raj", "Partner", "Student", "EEE", "abhi@gmail.com", "9967423122"}			
		};
	}
	
	
	@DataProvider(name = "dataBaseContactDetails")
	public Object[][] databaseContacts(){
		
		DataUtilities du = new DataUtilities();
		
		ArrayList<Object[]> result = du.getDataFromDatabase("select * from contacts");
		
		return result.toArray(new Object[0][]);
		
	}
	
	
	

}

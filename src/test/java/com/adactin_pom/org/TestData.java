package com.adactin_pom.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestData {
	public static Properties p;
	public TestData() throws IOException {
		File f = new File("C:\\Users\\Priya\\eclipse-workspace\\Maven31\\src\\test\\java\\com\\adactin_pom\\org\\Demo.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
			}
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}
	
	public String getpassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	public String getfirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	
	public String getlastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	
	
	public String getaddress() {
		String address = p.getProperty("address");
		System.out.println(address);
		return address;
		
	}
	public String creditcard() {
		String credit = p.getProperty("creditcard");
		return credit;
	}
	public String cvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
}

package com.adactin_pom.org;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.utility.UtilityFiles;



public class Runner_Class extends UtilityFiles {
	public static WebDriver driver=setproperty();
	public static Page_Manager pom = new Page_Manager(driver);
	public static void main(String[] args) throws IOException {
		
		url("https://adactinhotelapp.com/index.php");
		window_commands("maximize");
		
		String username = File_Readermanager.getInstanceFR().getInstanceTD().getUsername();
		send_keys(pom.getLp().getUsername(),username);
		String password = File_Readermanager.getInstanceFR().getInstanceTD().getpassword();
		send_keys(pom.getLp().getPassword(),password);
		click(pom.getLp().getLogin());

		select_index(pom.getRb().getLocation123(), 2);
		select_text(pom.getRb().getHotels(), "Hotel Creek");
		select_value(pom.getRb().getRoomtype(), "Standard");
		select_index(pom.getRb().getNo_of_room(), 2);
		select_index(pom.getRb().getAdult(), 1);
		select_index(pom.getRb().getChild_room(), 1);
		click(pom.getRb().getSubmit());

		click(pom.getHs().getRadiobutton());
		click(pom.getHs().getContinuepage());
		String firstname = File_Readermanager.getInstanceFR().getInstanceTD().getfirstname();
		send_keys(pom.getBp().getFirstname(),firstname);
		String lastname = File_Readermanager.getInstanceFR().getInstanceTD().getlastname();
		send_keys(pom.getBp().getLastname(), lastname);
		String address = File_Readermanager.getInstanceFR().getInstanceTD().getaddress();
		send_keys(pom.getBp().getAddress(), address);
		String creditcard = File_Readermanager.getInstanceFR().getInstanceTD().creditcard();
		send_keys(pom.getBp().getCc_num(), creditcard);
		select_value(pom.getBp().getCardtype(), "VISA");
		select_index(pom.getBp().getCarddetails(), 3);
		select_value(pom.getBp().getYear(), "2022");
		String cvv = File_Readermanager.getInstanceFR().getInstanceTD().cvv();
		send_keys(pom.getBp().getCvv(), cvv);
		click(pom.getBp().getBooknow());

		click(pom.getFp().getItenary());
	}

}

package com.adactin_pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Manager {
public WebDriver driver;

 public Page_Manager(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
private Login_Page lp;
private Room_Booking rb;
private Hotel_Summary hs;
private Billing_Page bp;
private Final_Page fp;

public Login_Page getLp() {
	if(lp==null) {
		lp=new Login_Page(driver);
	}
	return lp;
	
}
public Room_Booking getRb() {
	if(rb==null) {
		rb=new Room_Booking(driver);
	}
	return rb;
}
public Hotel_Summary getHs() {
	if(hs==null) {
		hs=new Hotel_Summary(driver);
	}
	return hs;
}
public Billing_Page getBp() {
	if(bp==null) {
		bp=new Billing_Page(driver);
	}
	return bp;
}
public Final_Page getFp() {
	if(fp==null) {
		fp=new Final_Page(driver);
	}
	return fp;
}

	
	
	
}

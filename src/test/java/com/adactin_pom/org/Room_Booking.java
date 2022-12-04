package com.adactin_pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Room_Booking {
public WebDriver driver;
	
	public Room_Booking(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		
@FindBy(xpath="//select[@name='location']")
private WebElement location123;
@FindBy(xpath="//select[@name='hotels']")
private WebElement hotels;
@FindBy(xpath="//select[@name='room_type']")
private WebElement roomtype;
@FindBy (xpath="//select[@name='room_nos']")
private WebElement no_of_room;
@FindBy(xpath="//select[@name='adult_room']")
private WebElement adult;
@FindBy(xpath="//select[@name='child_room']")
private WebElement child_room;
@FindBy(xpath="//input[@name='Submit']")
private WebElement submit;

                                                                                                                                                 
public WebElement getLocation123() {
	return location123;
}

public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getNo_of_room() {
	return no_of_room;
}
public WebElement getAdult() {
	return adult;
}
public WebElement getChild_room() {
	return child_room;
}
public WebElement getSubmit() {
	return submit;
}




}






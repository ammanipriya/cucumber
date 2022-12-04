package com.adactin_pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing_Page {
public WebDriver driver;
	
	public Billing_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement cc_num;
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cardtype;
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement carddetails;
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement year;
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement booknow;
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc_num() {
		return cc_num;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getCarddetails() {
		return carddetails;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}

	
}

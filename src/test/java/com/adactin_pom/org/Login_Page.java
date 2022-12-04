package com.adactin_pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}

@FindBy(xpath="//form[@name='login_form']/descendant::input[@name='username']")
private WebElement username;
@FindBy(xpath="//input[@name='password']")
private WebElement password;
@FindBy(xpath="//input[@name='login']")
private WebElement login;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}



	
	
	
}


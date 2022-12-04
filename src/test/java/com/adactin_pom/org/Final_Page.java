package com.adactin_pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_Page {
public WebDriver driver;
	
	public Final_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="(//input[@type='button'])[2]")
	private WebElement itenary;

	
	public WebElement getItenary() {
		return itenary;
	}
	
}

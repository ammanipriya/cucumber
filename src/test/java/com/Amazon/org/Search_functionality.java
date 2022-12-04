package com.Amazon.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_functionality {
	
public WebDriver driver;
	
	 public Search_functionality(WebDriver driver) {
	 		this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath="//input[@id='twotabsearchtextbox']")
private WebElement search;
public WebElement getSearch() {
	return search;
}
public WebElement getButton() {
	return button;
}
public WebElement getDropdown() {
	return dropdown;
}
@FindBy(xpath="//input[@type='submit']")
private WebElement button;

@FindBy(xpath="//select[@id='s-result-sort-select']")
private WebElement dropdown;

//"//i[@class='a-icon a-icon-dropdown']"
}

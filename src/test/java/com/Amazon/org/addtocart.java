package com.Amazon.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocart {
	
	
	public WebDriver driver;
	
   public addtocart(WebDriver driver) {
		 		this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
	
 	
	public WebElement getClickimg() {
	return clickimg;
}

public WebElement getAddtocart() {
	return addtocart;
}


	@FindBy(xpath="(//img[@class='s-image'])[1]")
	private WebElement clickimg;

	@FindBy (xpath="//input[@id='add-to-cart-button']")
	private WebElement addtocart;


}

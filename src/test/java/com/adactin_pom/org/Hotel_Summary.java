package com.adactin_pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Summary {
	public WebDriver driver;

	public Hotel_Summary(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radiobutton;
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continuepage;

	

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinuepage() {
		return continuepage;
	}

}

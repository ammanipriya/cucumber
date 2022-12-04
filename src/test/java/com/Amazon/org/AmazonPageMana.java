package com.Amazon.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonPageMana {
	public WebDriver driver;

	 public AmazonPageMana(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	private addtocart ac;
	private Search_functionality sf;
	
	public Search_functionality getSf() {
		if(sf==null) {
			sf=new Search_functionality(driver);
}
	return sf;
	}
	public addtocart getAc() {
		if(ac==null) {
			ac=new addtocart(driver);
			}
		return ac;
	}
	
	


	

}

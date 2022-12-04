package com.amazonstepdef;

import org.openqa.selenium.WebDriver;

import com.Amazon.org.AmazonPageMana;
import com.Amazon_Runner.Amazon_Runner;
import com.utility.UtilityFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class amazonstepdef extends UtilityFiles{
	public static WebDriver driver = Amazon_Runner.driver;
	public static AmazonPageMana pg = new AmazonPageMana(driver);
	
	
	@Given("User able to launch the url")
	public void user_able_to_launch_the_url() {
		url("https://www.amazon.in/");
		
	}



	@When("User able to type {string} on the Search Box in Homepage")
	public void user_able_to_type_on_the_search_box_in_homepage(String search) {
		send_keys(pg.getSf().getSearch(), search);
		
	}
	@When("User able to click on the Search button,it navigates to smartwatch page")
	public void user_able_to_click_on_the_search_button_it_navigates_to_smartwatch_page() {
		click(pg.getSf().getButton());
	}
	
	@Then("User able to click {string}")
	public void user_able_to_click(String dropdown) throws InterruptedException {
		Thread.sleep(7000);
		select_text(pg.getSf().getDropdown(),dropdown);
		
		
		pg.getSf().getDropdown().click();
			}

	@When("User able to  click on the product")
	public void user_able_to_click_on_the_product() throws InterruptedException {
		Thread.sleep(5000);
		click(pg.getAc().getClickimg());
		windowchange();	
	}
	@Then("User able to click add to cart")
	public void user_able_to_click_add_to_cart() {
		click(pg.getAc().getAddtocart());
	}






	
}

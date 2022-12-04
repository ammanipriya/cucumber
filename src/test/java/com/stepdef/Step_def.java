package com.stepdef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Adactin_Runner.Adactin_Runner;
import com.adactin_pom.org.File_Readermanager;
import com.adactin_pom.org.Page_Manager;
import com.utility.UtilityFiles;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_def extends UtilityFiles {
	public static WebDriver driver = Adactin_Runner.driver;
	public static Page_Manager pom = new Page_Manager(driver);

	@Before(order= 0 , value ="@login")
	public void signup() {
		System.out.println("url launched");
	}
	@Before(order=1,value="@Regression")
	 public void selecthotel() {
		 
	 }
	@Before(order=2,value="@Prod")
	public void search() {
		
	}
	@Given("url should be launched")
	public void url_should_be_launched() {

	}
   
	@When("user {string} name must be entered")
	public void user_name_must_be_entered(String Username) {
		send_keys(pom.getLp().getUsername(), Username);
	}
  
	@When("password {string} must be entered")
	public void password_must_be_entered(String Password) {
		send_keys(pom.getLp().getPassword(), Password);
	}
	@Then("click login btn")
	public void click_login_btn() {
		click(pom.getLp().getLogin());
	}

	@When("select The {string} Location")
	public void select_the_location(String location) {
		select_text(pom.getRb().getLocation123(), location);

	}

	@When("select  The {string} Hotel")
	public void select_the_hotel(String hotel) {
		select_text(pom.getRb().getHotels(), hotel);

	}

	@When("select The {string} Roomtype")
	public void select_the_roomtype(String roomtype) {
		select_text(pom.getRb().getRoomtype(), roomtype);

	}

	@When("select No Of Rooms")
	public void select_no_of_rooms() {
		select_index(pom.getRb().getNo_of_room(), 2);
	}

	@When("select The Checkin Date")
	public void select_the_checkin_date() {
	}

	@When("select The Checkout Date")
	public void select_the_checkout_date() {
	}

	@When("select the Adults per room")
	public void select_the_adults_per_room() {
		select_index(pom.getRb().getAdult(), 1);
	}

	@When("select The Children Per Room")
	public void select_the_children_per_room() {
		select_index(pom.getRb().getChild_room(), 1);
	}

	@Then("click Search Btn and navigates to {string} page")
	public void click_search_btn_and_navigates_to_page(String expectedpage) {
		click(pom.getRb().getSubmit());
		org.junit.Assert.assertEquals(expectedpage, driver.getTitle());
	}

	@When("seleck the hotel")
	public void seleck_the_hotel() {
		click(pom.getHs().getRadiobutton());
	}

	@Then("click continue and navigates to {string} page")
	public void click_continue_and_navigates_to_page(String expectedpage) {
		click(pom.getHs().getContinuepage());
		org.junit.Assert.assertEquals(expectedpage, driver.getTitle());
	}





	@When("enter Your First Name")
	public void enter_your_first_name() throws IOException {
		String firstname = File_Readermanager.getInstanceFR().getInstanceTD().getfirstname();
		send_keys(pom.getBp().getFirstname(), firstname);

	}

	@When("enter Your Last  Name")
	public void enter_your_last_name() throws IOException {
		String lastname = File_Readermanager.getInstanceFR().getInstanceTD().getlastname();
		send_keys(pom.getBp().getLastname(), lastname);

	}

	@When("enter your Address")
	public void enter_your_address() throws IOException {
		String address = File_Readermanager.getInstanceFR().getInstanceTD().getaddress();
		send_keys(pom.getBp().getAddress(), address);

	}

	@When("enter Your Creditcard Details")
	public void enter_your_creditcard_details() throws IOException {
		String creditcard = File_Readermanager.getInstanceFR().getInstanceTD().creditcard();
		send_keys(pom.getBp().getCc_num(), creditcard);

	}

	@When("select The Creditcard Type")
	public void select_the_creditcard_type() {
		select_value(pom.getBp().getCardtype(), "VISA");

	}

	@When("select Expiry Month")
	public void select_expiry_month() {
		select_index(pom.getBp().getCarddetails(), 3);
	}

	@When("select Expiry Year")
	public void select_expiry_year() {
		select_value(pom.getBp().getYear(), "2022");
	}

	@When("enter The Cvv Number")
	public void enter_the_cvv_number() throws IOException {
		String cvv = File_Readermanager.getInstanceFR().getInstanceTD().cvv();
		send_keys(pom.getBp().getCvv(), cvv);

	}
	

	@Then("click Book Now and navigate to {string} page")
	public void click_book_now_and_navigate_to_page(String expectedpage) {
		click(pom.getBp().getBooknow());
		org.junit.Assert.assertEquals(expectedpage, driver.getTitle());
		
	}

	@Then("click Myitinerary and navigate to {string} page")
	public void click_myitinerary_and_navigate_to_page(String expectedpage) {		
		click(pom.getFp().getItenary());
		org.junit.Assert.assertEquals(expectedpage, driver.getTitle());
}

	@When("user \"Ammanipriya\"name must be entered")
	public void user_ammanipriya_name_must_be_entered() {
	}
	




}

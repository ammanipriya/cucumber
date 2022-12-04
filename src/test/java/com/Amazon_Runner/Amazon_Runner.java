package com.Amazon_Runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.utility.UtilityFiles;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	  features=".//Features/Amazon.feature", 
	  glue="com.amazonstepdef",
	  monochrome = true,
	  dryRun = false,
	  publish = true,
	 plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:Report/amazon.html","json:Report/amazon.json"}
	  )
	
	public class Amazon_Runner {
		public  static WebDriver driver= UtilityFiles.setproperty();
		@BeforeClass
		public static void max() {
			driver.manage().window().maximize();;
		}
		
	@AfterClass
	public static void screenpic() throws IOException {
		UtilityFiles.Takes_Screenshot("C:\\Users\\Priya\\eclipse-workspace\\cucumber\\Screenshot\\amazon.png");
	}
	
}

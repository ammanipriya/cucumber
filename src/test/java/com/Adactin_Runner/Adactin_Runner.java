package com.Adactin_Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.utility.UtilityFiles;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features=".//Features/Adactin.feature", 
  glue="com.stepdef",

  monochrome = true,
  dryRun = false,
  publish = true,
  plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:Report/amazon.format","json:Report/amazon.json"}
)
public class Adactin_Runner{
	public  static WebDriver driver= UtilityFiles.setproperty();
	@BeforeClass
	public static void setup() {
		UtilityFiles.url("https://adactinhotelapp.com/index.php");
		
	}
	
	
	}
	

	
	
	


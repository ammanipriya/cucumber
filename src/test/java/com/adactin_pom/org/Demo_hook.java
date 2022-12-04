package com.adactin_pom.org;

import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
  features=".//Features/demo.feature", 
  glue="com.stepdef")

public class Demo_hook {
	
	@Before
	private void login() {
		System.out.println("login");
	}
	
	@After
private void casual() {
		System.out.println("casual");
	}
	
	
	
	
	
	
}

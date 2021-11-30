package com.santokart.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

	@Before("@RegTest")
	public void beforeValidation() {
		System.out.println("I'm a Hook before RegTest");
	}
	
	@After("@SmokeTest")
	public void afterSmokeTest() {
		System.out.println("I'm a Hook after SmokeTest");
	}
	
	@Before("@SeleniumTest")
	public void beforeSeleniumTest() {
		
	}
}

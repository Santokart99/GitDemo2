package com.santokart.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("User is on landing page")
	public void user_is_on_landing_page() throws Throwable{
		System.out.println("User is on landing Page");
	}
	
	@When("User login into application with {string} and {string}")
	public void user_login_into_application_with_username_and_password(String username, String password) throws Throwable{
		System.out.println("Login success with: "+username+" and "+password);
	}
	
	@Then("Home Page is displayed")
	public void home_page_is_displayed() throws Throwable{
		System.out.println("Home Page is displayed");

	}
	
	@And("Cards are displayed {string}")
	public void cards_are_displayed(String value) throws Throwable{
		System.out.println("Cards are displayed");
		System.out.println(value);
	}
	
	@Given("Validate the browser")
	public void validate_the_browser() {
		System.out.println("Browser is validated");
	}
	
	@When("Browser is triggered")
	public void browser_is_triggered() {
		System.out.println("Browser is open");
	}
	
	@Then("Check if browser has started")
	public void check_if_browser_has_started() {
		System.out.println("Browser has started");
	}
}

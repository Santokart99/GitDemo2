package com.santokart.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumStepDefinition {
	
	private WebDriver driver;

	@Given("User is on Greencart Landing page")
	public void user_is_on_greencart_landing_page() throws Throwable{
		
		driver = BaseClass.getDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	@When("User searched for {string} vegetable")
	public void user_searched_for_something_vegetable(String vegetable) throws Throwable{
		
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys(vegetable);
		Thread.sleep(3000);
	}
	
	@Then("{string} results are displayed")
	public void something_results_are_displayed(String vegetable) throws Throwable{
		boolean expected = driver.findElement(By.cssSelector("h4[class='product-name']")).getText().contains(vegetable);
		Assert.assertTrue(expected);
		driver.quit();
	}
	
	@And("Added items to cart")
	public void added_items_to_cart() throws Throwable{
		
		driver.findElement(By.cssSelector("div[class='product-action'] button[type='button']")).click();
	}
	
	@And("User proceed to Checkout page to purchase")
	public void user_proceed_to_checkout_page_to_purchase() throws Throwable{
		
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']"))).click();
		Thread.sleep(2000);
	}
	
	@Then("Verify selected {string}")
	public void verify_selected_something(String vegetable) throws Throwable{
		boolean expected = driver.findElement(By.cssSelector(".product-name")).getText().contains(vegetable);
		Assert.assertTrue(expected);
		driver.quit();
	}
}

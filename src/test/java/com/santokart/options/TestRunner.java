package com.santokart.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/santokart/features",
				 glue={"com.santokart.stepdefinition"},
				 tags="@SeleniumTest")
public class TestRunner {

}

package com.vijay.bdd.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutline {

	public static WebDriver obj=null;
	
	@Given("^Open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
		 System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\geckodriver\\geckodriver-v0.17.0-win64\\geckodriver.exe");
         obj=new FirefoxDriver();
         obj.manage().window().maximize();
         obj.get("https://www.facebook.com");
	}

	@When("^I enter valid userid(\\d+) and valid passwors(\\d+)$")
	public void i_enter_valid_userid_and_valid_passwors(String username, String password) throws Throwable {
		obj.findElement(By.id("email")).sendKeys(username);
		obj.findElement(By.id("pass")).sendKeys(password);
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	}

	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
		obj.quit();
	}

	@When("^I enter valid userid(\\d+) and valid password(\\d+)$")
	public void i_enter_valid_userid_and_valid_password(int arg1, int arg2) throws Throwable {
	}
	
}

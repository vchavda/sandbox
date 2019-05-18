package com.vijay.bdd.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepDefinition {
	
    public static WebDriver obj=null;
	
	@Given("^url opened$")
	public void url_opened() throws Throwable {
		
		 System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\geckodriver\\geckodriver-v0.17.0-win64\\geckodriver.exe");
         obj=new FirefoxDriver();
         obj.manage().window().maximize();
         obj.get("https://mail.google.com");
	}

	@Then("^enter user id and click next$")
	public void enter_user_id_and_click_next() throws InterruptedException  {
        Thread.sleep(2000);
	}

	@Then("^enter password$")
	public void enter_password() throws Throwable {
		obj.findElement(By.className("Xb9hP")).sendKeys("google");
	}

	@Then("^click login$")
	public void click_login() throws Throwable {
		obj.findElement(By.className("CwaK9"));
	    Thread.sleep(6000);
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		obj.quit();
	}


}

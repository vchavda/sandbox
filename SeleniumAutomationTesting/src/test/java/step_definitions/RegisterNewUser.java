package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.po_RegisterNewUser;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterNewUser {

    public static String baseUrl="http://demo.automationtesting.in/";
	public WebDriver driver;
	java.util.Date timeStamp= new java.util.Date();
	
	@Before
	public void www() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void xx() {
		driver.quit();
	}

	@Given("^I navigate to the register page$")
	public void i_navigate_to_the_register_page() {
		System.out.println("clicking the sign in button...");
		po_RegisterNewUser registerNewUser  =  PageFactory.initElements(driver, po_RegisterNewUser.class);	
		driver.get(baseUrl);
		registerNewUser.clickSkipsignInBtn();	
	}

	@When("^I fill in the new user details$")
	public void i_fill_in_the_new_user_details() throws InterruptedException {

		po_RegisterNewUser registerNewUser  =  PageFactory.initElements(driver, po_RegisterNewUser.class);	
		registerNewUser.enterFirstname("Joe");
		registerNewUser.enterLasttname("Bloggs");
		registerNewUser.enterAddress("10 Downing Street");
		registerNewUser.enterEmail(timeStamp+"@pop.com");
		registerNewUser.enterPhone("123456789");
		registerNewUser.ClickMaleRadioButton();
		registerNewUser.selectSkill("Java");
		registerNewUser.selectCountry("Brazil");
		registerNewUser.selectCounty("India");
		registerNewUser.selectYear("");
		registerNewUser.selectMonth("");
		registerNewUser.selectDay("");
		registerNewUser.enterPassword("123Password");
		registerNewUser.enterConfirmPassword("123Password");

		// click the submit button
		//registerNewUser.clickSubmitBtn();
		//Thread.sleep(5000);
		//   assertEquals(driver.getTitle(), "Web Table");

	}

	@Then("^I should be registered to the system$")
	public void i_should_be_registered_to_the_system() {

	}

}

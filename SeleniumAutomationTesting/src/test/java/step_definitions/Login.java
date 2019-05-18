package step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

    public static String baseUrl="http://demo.automationtesting.in/";
	public WebDriver driver;
	
	@Before
	public void www () {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void xx() {
		driver.quit();
	}
	
	@When("^I log onto the website$")
	public void i_log_onto_the_website() {
		System.out.println("logging onto website");

		driver.get(baseUrl);
		driver.getTitle();
		assertEquals(driver.getTitle(), "Index");
	}

	@Then("^I should be on that website$")
	public void i_should_be_on_that_website() {
		assertTrue(true);
	}
	

	

}

package Base;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjectModel.BasePage;

public class BasePageTest extends TestBaseSetup {

	private WebDriver driver;

	@BeforeClass
	private void setUp() {
		driver = getDriver();
	}

	@Test
	private void verifyHomePage() {
		System.out.println("home page test ...");
		BasePage basePage = new BasePage(driver);
		Assert.assertTrue(basePage.verifyBasePageTitle(), "Home page title doesn't match");
	}

}

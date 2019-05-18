package Base;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjectModel.BasePage;
import pageObjectModel.SignInPage;

public class SignInPageTest extends TestBaseSetup {
	private WebDriver driver;
	private SignInPage signInPage;
	private BasePage basePage;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
	}

	@Test
	public void verifySignInFunction() {
		System.out.println("Sign In functionality details...");
		basePage = new BasePage(driver);
		signInPage = basePage.clickSignInPage();
		Assert.assertTrue(signInPage.verifySignInPageTitle(), "Sign in - Google Accounts");

	}

}

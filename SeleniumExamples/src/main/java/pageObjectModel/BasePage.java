package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	protected WebDriver driver;

	private By signinButton = By.linkText("Sign in");

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public SignInPage clickSignInPage() {
		System.out.println("clicking on the sign in button");
		WebElement signinBtnElement = driver.findElement(signinButton);

		if (signinBtnElement.isDisplayed() || signinBtnElement.isEnabled())
			signinBtnElement.click();
		else
			System.out.println("Element not found");

		return new SignInPage(driver);
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public boolean verifyBasePageTitle() {
		String expectedPagetitle = "Google";
		return getPageTitle().contains(expectedPagetitle);
	}

}

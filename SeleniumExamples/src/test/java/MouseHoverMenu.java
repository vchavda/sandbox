import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class MouseHoverMenu {

	// By holidays_link = By.xpath("//a[@class='MenuItem MenuHasChildren']");

	@FindBy(xpath = "//a[@class='MenuItem MenuHasChildren']")
	private WebElement holidays_link;

	@FindBy(xpath = "//a[contains(@href,'Coach-Holidays') and @class='MenuItem']")
	private WebElement coach_holidays_link;

	public WebDriver driver;

	public MouseHoverMenu() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\\\Selenium\\geckodriver\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		org.openqa.selenium.support.PageFactory.initElements(driver, this);
	}

	@Test
	public void MouseHoverExample() throws InterruptedException {
		driver.get("https://www.startours.co.uk/");
		Thread.sleep(5000);
		Actions builder = new Actions(driver);
		builder.moveToElement(holidays_link).perform();
		coach_holidays_link.click();
	}

	@AfterSuite
	private void quit() {
		driver.quit();
	}
}

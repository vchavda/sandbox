import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Keyboard {
	@FindBy(id = "gs_htif0")
	private WebElement google_searchbar;

	public WebDriver driver;

	public Keyboard() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\\\Selenium\\geckodriver\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		org.openqa.selenium.support.PageFactory.initElements(driver, this);
	}

	@Test
	public void KeyboardExample() {
		driver.get("https://www.google.co.uk");
		google_searchbar.sendKeys("Hello");
		google_searchbar.sendKeys(Keys.CONTROL + "a");
		google_searchbar.sendKeys(Keys.CONTROL + "x");
		google_searchbar.sendKeys(Keys.CONTROL + "v");
	}

	@AfterSuite
	private void quit() {
		driver.quit();
	}
}

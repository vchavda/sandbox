import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class DragDrop {

	@FindBy(id = "g")
	private WebElement green_box;

	@FindBy(id = "oReport2")
	private WebElement target_box;

	public WebDriver driver;

	public DragDrop() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\\\Selenium\\geckodriver\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		org.openqa.selenium.support.PageFactory.initElements(driver, this);
	}

	@Test
	public void DragDropExample() throws InterruptedException {
		driver.get("http://aboodman.github.io/dom-drag/demo.html");
		Thread.sleep(5000);
		Actions builder = new Actions(driver);
		builder.dragAndDrop(green_box, target_box).perform();
	}

	@AfterSuite
	private void quit() {
		driver.quit();
	}

}

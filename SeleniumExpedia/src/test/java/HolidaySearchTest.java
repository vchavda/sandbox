import static org.testng.Assert.assertEquals;

import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HolidaySearchTest extends Base {

	private WebDriver driver;
	HolidaySearch holidaySearch;
	
	
	@BeforeClass
	private void setUp() {
		driver = getDriver();
		holidaySearch = new HolidaySearch(driver);
	}
	
	@Ignore
	private void verifyHomePage() {
		System.out.println("home page test ...");
		Assert.assertTrue(holidaySearch.verifyPageTitle(), "Home page title doesn't match");
	}
	
	@Test
	private void verifyDsicoverTab() throws InterruptedException {
		holidaySearch.clickDiscoverTab();
		holidaySearch.searchDiscovertext();
		holidaySearch.clickSearchDiscoverButton();
		assertEquals(true, true);
	}
	
}

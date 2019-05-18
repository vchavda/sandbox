import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomPageStepDef extends Base{
	
	private WebDriver driver;
//	HolidaySearch holidaySearch;
	
	@BeforeClass
	private void setUp() {
		driver = getDriver();
	//	holidaySearch = new HolidaySearch(driver);
	}
	
	@Given("^url opens$")
	public void url_opens() throws Throwable {
		System.out.println("Given Step");
		assert(true);
	}
	
	@When("^page loads$")
	public void page_loads() throws Throwable {
		System.out.println("When Step");
		assert(true);
	}

	@Then("^verify on the correct home page$")
	public void verify_on_the_correct_home_page() throws Throwable {
		System.out.println("Then Step");
		HolidaySearch holidaySearch;
		holidaySearch = new HolidaySearch(driver);
		Assert.assertTrue(holidaySearch.verifyPageTitle(), "Home page title doesn't match");
		assert(true);
	}
}

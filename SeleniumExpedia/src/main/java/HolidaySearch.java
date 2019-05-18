import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HolidaySearch {
	protected WebDriver driver;
	
	static String PAGE_TITLE ="Book Cheap Holidays: Flights, Hotels, Car hire | Expedia";
	
	private By discoverTab = By.id("tab-openSearch-tab-hp");
	private By discoverSearchText = By.id("openSearch-searchQuery-hp-openSearch");
	private By discoverSearchBtn = By.xpath("//*[@id='gcw-open-search-form-hp-openSearch']/button");
	private By searchOption = By.xpath("//*[@id='aria-option-4']");

	public HolidaySearch(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyPageTitle() {
		String expectedPagetitle = PAGE_TITLE;
		return getPageTitle().contains(expectedPagetitle);
	}
	
	public void clickDiscoverTab() {
		WebElement discoverTabElement = driver.findElement(discoverTab);
		
		if (discoverTabElement.isDisplayed() || discoverTabElement.isEnabled())
			discoverTabElement.click();
		else
			System.out.println("Element not found");
	}
	
	public void searchDiscovertext() {
		WebElement discoverSearchTextElement = driver.findElement(discoverSearchText);
		
		if (discoverSearchTextElement.isDisplayed() || discoverSearchTextElement.isEnabled())
		{
			discoverSearchTextElement.sendKeys("kilimanjro");
		}
		else
			System.out.println("Element not found");
	}

	public void clickSearchDiscoverButton() {
		WebElement discoverSearchBtnElement = driver.findElement(discoverSearchBtn);
		driver.findElement(searchOption).click();
		
		
		if (discoverSearchBtnElement.isDisplayed() || discoverSearchBtnElement.isEnabled())
		{
			System.out.println("clicking on the search button");
			discoverSearchBtnElement.click();
		}
		else
			System.out.println("Element not found");
	}
}

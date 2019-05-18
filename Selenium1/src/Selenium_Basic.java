import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Basic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\\\Selenium\\geckodriver\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	    String baseUrl = "http://google.com";
	    
	    //-- open google --//
	    driver.get(baseUrl);
	    
	    //-- find the search field it will return you the WebElement--//
	    WebElement searchbox = driver.findElement(By.className("gsfi"));

	    //-- use the WebElement and type the search text --//
	    searchbox.sendKeys("Kilimanjaro");
	    
	    //-- find the search button and click on it --//
/*	    WebElement GoogleSearchButton = driver.findElement(By.name("btnK"));
	    GoogleSearchButton.click();
*/	    				
	    // you can shorten the above by this line
	    driver.findElement(By.name("btnK")).click();;
	    
	    //-- find the Wikipedia link and click on it --//
	    driver.findElement(By.linkText("Mount Kilimanjaro - Wikipedia")).click();
	    
	}

}

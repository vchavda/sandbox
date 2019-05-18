package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTestNGFile {
  
  public String baseUrl = "http://google.co.uk/";
  String drivePath = "C:\\\\Selenium\\geckodriver\\geckodriver-v0.17.0-win64\\geckodriver.exe";
  public WebDriver driver;
	
  @BeforeTest
  public void launchBrowser() {
	  System.setProperty("webdriver.gecko.driver", drivePath);
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(baseUrl);
  }
  
  @Test
  @Parameters({"author", "searchKey"})
  public void verifyHomePageTitle(@Optional("Abc") String author,String searchKey) throws InterruptedException{

	  String expectedTitle = "Google";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
	  WebElement searchText = driver.findElement(By.name("q"));
	  //Searching text in google text box
      searchText.sendKeys(searchKey);
      
      System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
      System.out.println("Thread will sleep now");
      Thread.sleep(3000); 
      System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
      //verifying the value in google search box
      AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));
      
  }
      
 
  @AfterTest
  public void terminateBrowser() {
	  driver.close();	
  }
}

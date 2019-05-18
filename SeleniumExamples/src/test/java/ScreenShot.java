import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class ScreenShot {
	
	public WebDriver driver;

	public ScreenShot() {
		
		System.setProperty("webdriver.gecko.driver","C:\\\\Selenium\\geckodriver\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();		
	}
	
	
	@Test
	public void testMethod()   {
		
		driver.get("http://www.espncricinfo.com");
		driver.manage().window().maximize();
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String screenshot = UUID.randomUUID().toString();
		
		try {
			org.apache.commons.io.FileUtils.copyFile(scrFile, new File("C:\\temp\\screenshot-"+screenshot+".png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		
	}

}

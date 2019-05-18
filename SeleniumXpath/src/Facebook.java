import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\\\Selenium\\geckodriver\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    String baseUrl = "http://facebook.com";
	    driver.get(baseUrl);
	    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("vijaychavda@hotmail.com");
	    driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123facebook");
	    driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Keys.ENTER);
	    driver.findElement(By.className("_3mht")).click();
	    //driver.findElement(By.xpath("//*[@id='navItem_2356318349']/a/div")).click();
	}

}

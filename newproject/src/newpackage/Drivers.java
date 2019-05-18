package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;


public class Drivers {

	protected ChromeDriver setChromeDrivers() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");; 
		return new ChromeDriver();
	}
	
		
}

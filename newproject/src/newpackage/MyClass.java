package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyClass {
	public static  WebDriver driver ;

	public static void main(String[] args) {
		
		// policy variables
		Policy policy = new Policy();
				
        // set Web Drivers
		Drivers drivers = new Drivers();
		
		System.setProperty("webdriver.gecko.driver","C:\\\\Selenium\\geckodriver\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		//driver = new FirefoxDriver();

		driver = drivers.setChromeDrivers();

		
        String baseUrl = "http://10.67.24.101:9083/Jasper/";
        String expectedTitle = "1insurer - Login";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        // will maximize the window
        driver.manage().window().maximize();

                
    	//Wait
		WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
        
        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        //login
        driver.findElement(By.name("username")).sendKeys(policy.username);
        driver.findElement(By.name("password")).sendKeys(policy.password);
        driver.findElement(By.name("Login")).click();
        
        //previous session work items
          
               
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSubmitActions")));
		WebElement myButton = driver.findElement(By.xpath("//button[contains(.,'"+"Restore all"+"')]"));
		myButton.click();
		WebElement myButton2 = driver.findElement(By.xpath("//button[contains(.,'"+"Apply"+"')]"));
		myButton2.click();

        
        
        //close Fire fox
        driver.close();
       
        // exit the program explicitly
        System.exit(0);
    }


}
	
	


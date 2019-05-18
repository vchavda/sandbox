package ReadFromExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class ExcelRead {

	public static void main(String[] args) throws IOException {

		try {
			// Open the Excel file
			FileInputStream excelFile = new FileInputStream("C:\\temp\\datasource.xlsx");

			// Access the required test data sheet
			XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
			XSSFSheet sheet = workbook.getSheet("testdata");

			System.out.println("sheet last row num  " + sheet.getLastRowNum());
			// System.out.println("count before = " + count);

			// loop through all rows in the sheet
			for (int count = 1; count <= sheet.getLastRowNum(); count++) {
				System.out.println("count after = " + count);
				XSSFRow row = sheet.getRow(count);
				System.out.println("running test case " + row.getCell(0).toString());
				// Run the test for the current test data row
				runTest(row.getCell(1).toString(), row.getCell(2).toString());
			}

			excelFile.close();
		} catch (IOException e) {
			System.out.println("Test data file not found");
		}

	}

	private static void runTest(String strSearchString, String strPagetitle) {

		// Start a browser driver (headless) and navigate to Google
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.google.com");

		/*
		 * normal browser System.setProperty("webdriver.chrome.driver",
		 * "C:\\\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe")
		 * ; ChromeDriver driver = new ChromeDriver();
		 */
		String baseUrl = "http://google.com";

		// -- open google --//
		driver.get(baseUrl);

		// Enter the search string and send it
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(strSearchString);
		element.submit();

		// check the title of the page
		if (driver.getTitle().equals(strPagetitle)) {
			System.out.println("page title is " + strPagetitle + ", as expected");
		} else {
			System.out
					.println("Expected page title was " + strPagetitle + ", but was " + driver.getTitle() + " instead");
		}

		// close the browser
		driver.quit();
	}

}

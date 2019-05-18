package PageObjects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;;

public class po_RegisterNewUser {

	@FindBy(how = How.XPATH, using = "//button[@id='btn2']")
	private WebElement skipSignInBtn;

	@FindBy(how = How.CSS, using = "[ng-model='FirstName']")
	private WebElement firstName;

	@FindBy(how = How.CSS, using = "[ng-model='LastName']")
	private WebElement lastName;

	@FindBy(how = How.CSS, using = "[ng-model='Adress']")
	private WebElement address;

	@FindBy(how = How.CSS, using = "[ng-model='EmailAdress']")
	private WebElement email;

	@FindBy(how = How.CSS, using = "[ng-model='Phone']")
	private WebElement phone;

	@FindBy(how = How.XPATH, using = "//input[@value='Male']")
	private WebElement MaleRadioButton;

	@FindBy(how = How.XPATH, using = "//*[@id='checkbox1']")
	private WebElement cricketCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='msdd']")
	private WebElement LanguageTextBox;

	@FindBy(how = How.XPATH, using = "//*[@id='Skills']")
	private List<WebElement> skillsDropDown;

	@FindBy(how = How.XPATH, using = "//*[@id='countries']")
	private List<WebElement> countryDropDown;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='select2-country-container']")
	private List<WebElement> countyDropDown;

	@FindBy(how = How.XPATH, using = "//*[@id='yearbox']")
	private List<WebElement> yearBox;

	@FindBy(how = How.CSS, using = "[ng-model='monthbox']")
	private List<WebElement> monthBox;

	@FindBy(how = How.CSS, using = "#daybox")
	private List<WebElement> dayBox;

	@FindBy(how = How.CSS, using = "#firstpassword")
	private WebElement password;

	@FindBy(how = How.CSS, using = "#secondpassword")
	private WebElement confirmPassword;
	
	@FindBy(how = How.CSS, using = "#Button1")
	private WebElement submitBtn;
	
	////////////////////////////////////////////////////////////////////////////////

	public void clickSkipsignInBtn() {
		skipSignInBtn.click();
	}

	public void enterFirstname(String firstname) {
		firstName.sendKeys(firstname);
	}

	public void enterLasttname(String lastname) {
		lastName.sendKeys(lastname);
	}

	public void enterAddress(String addressVal) {
		address.sendKeys(addressVal);
	}

	public void enterEmail(String emailVal) {
		email.sendKeys(emailVal);
	}

	public void enterPhone(String phoneVal) {
		
		Random rand = new Random();
		Integer num = rand.nextInt(900000000) + 1000000000;
		
		phone.sendKeys(num.toString());
	}

	public void ClickMaleRadioButton() {
		cricketCheckBox.click();
	}

	public void ClickCricketCheckBox() {
		MaleRadioButton.click();
	}

	public void enterlanguage(String lang) {
		LanguageTextBox.sendKeys(lang);
	}

	public void selectSkill(String skillRequired) {

		for (WebElement skill : skillsDropDown) {
			if (skill.getText().equals(skillRequired)) {
				skill.click();
			}
		}
	}

	public void selectCountry(String countryRequired) {

		for (WebElement country : countryDropDown) {
			if (country.getText().equals(countryRequired)) {
				country.click();
			}
		}
	}

	public void selectCounty(String countyRequired) {

		for (WebElement county : countyDropDown) {
			if (county.getText().equals(countyRequired)) {
				county.click();
			}
		}
	}
	
	public void selectYear(String yearRequired) {

		for (WebElement year : yearBox) {
			if (year.getText().equals(yearRequired)) {
				year.click();
			}

		}
	}
	
	
	public void selectMonth(String monthRequired) {

		for (WebElement month : monthBox) {
			if (month.getText().equals(monthRequired)) {
				month.click();
			}

		}
	}
	
	public void selectDay(String dayRequired) {

		for (WebElement day : dayBox) {
			if (day.getText().equals(dayRequired)) {
				day.click();
			}

		}
	}
		
	public void enterPassword(String passwordRequired) {
		password.sendKeys(passwordRequired);
	}

	public void enterConfirmPassword(String confirmPasswordRequired) {
		confirmPassword.sendKeys(confirmPasswordRequired);
	}
	
	
	public void clickSubmitBtn() {
		submitBtn.click();
	}
	
	
	
}

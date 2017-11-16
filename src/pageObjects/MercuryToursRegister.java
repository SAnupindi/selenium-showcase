package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MercuryToursRegister {

	WebDriver driver;

	public MercuryToursRegister(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*
	 * @FindBy(name="country") WebElement countryDropdown;
	 * 
	 * //countryDropdown.click();
	 * 
	 * Select country =new Select(countryDropdown); country.click(1);
	 */

	@FindBy(xpath =  "//input[@name='firstName']")
	WebElement firstNameTextbox;

	public void enterFirstName(String name) {
		firstNameTextbox.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='userName']")
	WebElement emailTextbox;

	public void enterEmail(String email) {
		emailTextbox.sendKeys(email);
	}

}

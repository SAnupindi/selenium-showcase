package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesAndTables {

	WebDriver driver;

	public FramesAndTables(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Getting all rows:
	@FindBy(xpath = "//table[@class='tsc_table_s13']/tbody/tr")
	List<WebElement> rowsList;

	// Usecase: Get the name of the structure when the name of the country is given.
	public String getStructureName(String country) {
		String structName = null;
		String getCountry = null;
		for (int i = 0; i < rowsList.size(); i++) {
			getCountry = rowsList.get(i).findElements(By.tagName("td")).get(0).getText();

			if (getCountry.equals(country)) {
				structName = rowsList.get(i).findElements(By.tagName("th")).get(0).getText();
				return structName;

			}
		}
		return structName;
	}
}

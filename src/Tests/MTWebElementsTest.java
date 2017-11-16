package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.MercuryToursRegister;
import utilities.InitExit;
import utilities.Util;

public class MTWebElementsTest {
	  	InitExit initExitObject;
	  	String pageUrl = Util.DROPDOWNEXAMPLE;
	  	WebDriver driver;
	  	
	  	MercuryToursRegister pageObject ;
	  	
	  	
	    @Test
	    public void testDropdown() {
	    	pageObject = new MercuryToursRegister(driver);
	    	WebElement country= driver.findElement(By.name("country"));
	    	Select countryDropdown = new Select(country);
	    	countryDropdown.selectByValue("210");
	    	//or use ByVisibleText to select entry by what's visible to the user.
	    	countryDropdown.selectByVisibleText("UGANDA");
	    	
	    }
	  

	@Test
	public void enterFirstName() {
		pageObject = new MercuryToursRegister(driver);
		pageObject.enterFirstName("Sirisha");
		Assert.assertTrue(true);
	}

	  	
	  	/*@Test
	  	public void enterEmail(){
	  		//pageObject.enterEmail("siri@asd.com");
	  		WebElement email= driver.findElement(By.xpath("//input[@id='userName']"));
	  		email.sendKeys("asdsds@sdfsa.com");
	  		Assert.assertTrue(true);
	  	
	  		
	  	}*/
	  	
	@BeforeMethod
	public void beforeMethod() {
		initExitObject = new InitExit();
		driver = initExitObject.init(pageUrl);

	}

	@AfterMethod
	public void afterMethod() {
		initExitObject.exit();
	}


}

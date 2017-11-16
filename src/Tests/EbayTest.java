/*a.	Go to home page:  https://www.ebay.com/
b.	Check if home tab is enabled
c.	Click on Toys tab
d.	Click on shop now button –verify title
e.	Click on hunting –verify title
f.	Click optics – verify title, all listings tab is enabled
g.	Click on the first item
 */

package Tests;

import org.testng.annotations.Test;

import pageObjects.Ebay;
import utilities.InitExit;
import utilities.Util;

import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class EbayTest {
	InitExit initExitObject;
  	String pageUrl = Util.EBAYHOMEPAGE;
  	WebDriver driver;
  	Ebay homepageObject ;
  	
  	
  @Test
  public void testHomeMenuEnabled() {
	  homepageObject= new Ebay(driver);
	  Assert.assertTrue(homepageObject.homeMenu.isEnabled());
	  
	  homepageObject.clickToysMenu();
	  
	  //Verify shop now title
	  Assert.assertEquals("Shop Now", homepageObject.shopNowBtn.getText());
	  homepageObject.clickShopNowBtn();
	  
	  //Click on the dropdown
	  homepageObject.clickCategoriesDrpdwn();
	  //click on 
	  homepageObject.clickCategory("Art Fx");
	  
	  
  }
  
  
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

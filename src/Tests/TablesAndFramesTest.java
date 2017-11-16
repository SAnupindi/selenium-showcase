package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.FramesAndTables;
import utilities.InitExit;
import utilities.Util;

public class TablesAndFramesTest {
	InitExit initExitObject;
  	String pageUrl = Util.PRACTICE_TABLE;
  	WebDriver driver;
  	
  	FramesAndTables pageObject;
  	
  @Test
  public void testVerifyStructureNames() {
	  
	  pageObject=new FramesAndTables(driver);
	  String structureName= pageObject.getStructureName("China");
	  System.out.println(structureName);
	  
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

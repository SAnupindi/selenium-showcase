package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay {

	WebDriver driver;

	public Ebay(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	//Web Elements
	@FindBy(xpath="//li[@class='hl-cat-nav__active']")
	public WebElement homeMenu;
	
	@FindBy(xpath="//li[@class='hl-cat-nav__js-tab']/a[@_sp='p2481888.m1385.l3250']")
	public WebElement toysMenu;
	
	public void clickToysMenu(){
		toysMenu.click();
	}
	
	//ebay toys page
	@FindBy(xpath="//a[@class='b-promobanner__info-btn btn btn--faux']")
	public WebElement shopNowBtn;
	
	public void clickShopNowBtn(){
		shopNowBtn.click();
	}
	
	//Toys-events - when heroes join forces page
    @FindBy(xpath="//div[@id='w2']/button")
    public WebElement allCategoriesDrpDwn;
    
    public void clickCategoriesDrpdwn(){
    	allCategoriesDrpDwn.click();
    }
    	
    @FindBy(xpath="//div[@class='ebayui-category-dropdown-flyout-wrapper']//ul/li/a/span")
    List<WebElement> allCatListLinks;
    
    public void clickCategory(String catName){
    	for(WebElement e : allCatListLinks) {
    		if(e.getText().equals(catName)){
    			e.click();    			
    		}
    		
    	}
    }
}

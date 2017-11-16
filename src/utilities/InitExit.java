package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitExit {
	
WebDriver driver;

	
	public WebDriver init(String pageUrl) {
		/*ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myProfile = profile.getProfile(Util.FIREFOXPROFILE);
		driver = new FirefoxDriver(new FirefoxBinary(new File(Util.FIREFOXPATH)), myProfile);
		*/
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(pageUrl);
		driver.manage().window().maximize();
		return driver;
	}

	
	public void exit() {
		driver.close();
		driver.quit();
	}



}

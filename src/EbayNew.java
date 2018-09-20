import java.util.concurrent.TimeUnit;

/*
 * @Author : Ramya GG
 * */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class EbayNew {
	
	WebDriver driver;
	Screen myScreen;
	
	public void invokeBrowser(){
		try {
			System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			driver.get("https://www.ebay.in");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void searchHomeOnEbay() {
		try {
			Pattern ebayDeals = new Pattern("H:\\Edureka\\Selenium\\Sikuli Code Files\\Ebay_deals.PNG");
			Pattern ebayHome = new Pattern("H:\\Edureka\\Selenium\\Sikuli Code Files\\Ebay_home.PNG");
			myScreen = new Screen();
			myScreen.wait(ebayDeals, 10);
			myScreen.click(ebayDeals);
			myScreen.wait(ebayHome, 10);
			myScreen.click(ebayHome);
		} catch (FindFailed e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		EbayNew myObj = new EbayNew();
		myObj.invokeBrowser();
		myObj.searchHomeOnEbay();
		
	}

}

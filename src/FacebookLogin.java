 import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.python.antlr.ast.Pass;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FacebookLogin {
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
			driver.get("https://www.facebook.com");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void signInUsingSikuli() {
		try {
			Pattern userID = new Pattern("H:\\Edureka\\Selenium\\Sikuli Code Files\\EmailOrPhone.PNG");
			Pattern password = new Pattern("H:\\Edureka\\Selenium\\Sikuli Code Files\\Password.PNG");
			Pattern login = new Pattern("H:\\Edureka\\Selenium\\Sikuli Code Files\\Login.PNG");
			
			myScreen = new Screen();
			myScreen.wait(userID, 5);
			myScreen.type(userID, "ramyagg33@gmail.com");
			myScreen.type(password, "agshjdgdhd");
			myScreen.click(login);
		} catch (FindFailed e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		FacebookLogin myObj = new FacebookLogin();
		myObj.invokeBrowser();
		myObj.signInUsingSikuli();

	}

}

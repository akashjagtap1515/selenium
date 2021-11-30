package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-notifications");//code for disable fb notification
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		Login l = new Login(driver);
		l.sendUsername();
		l.sendpassword();
		l.clickOnlogin();
		
		Profile p =new Profile(driver);
		p.ProfilePage();
		
//		Logout log = new Logout(driver);
//		log.ClickOnLogout();


	

	}

}

package Grow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GrowTest {
	WebDriver driver;
	login l;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://groww.in/login");
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void beforemethod() {
		 l = new login(driver);
			l.SendLogin();
	}
	
	@Test(priority=1)
	public void testipo() {
		ipo i = new ipo(driver);
		i.ClickOnipo();
	}
	
//	@Test(priority =0)
//	public void testStocks() throws InterruptedException {
//		stocks s=new stocks(driver);
//		s.BuyStocks();
//	}
	
	@AfterMethod
	public void afterMethod() {
		Logout log = new Logout(driver);
		log.ClickOnLogout();
		
		
		
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	
	
	}

}

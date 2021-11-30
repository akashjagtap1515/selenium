package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FbTestClass {
	WebDriver driver;
	Login l;
	@BeforeClass
	public void BeforeClass()
	{
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-notifications");//code for disable fb notification
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe\\");
		 driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
	  l = new Login(driver);
	    l.sendUsername();
		l.sendpassword();
		l.clickOnlogin();
	 
	}
	@Test(priority = 1)
	public void testpost() throws InterruptedException
	{
		Post p =new Post(driver);
		p.ClickOnPost();
	}
	
	@Test(priority = 2)
	public void testProfile() throws InterruptedException
	{
		Profile p = new Profile (driver);
		p.ProfilePage();
	}
	
	@Test
	public void verifyWatch()
	{
		WatchButton w =new WatchButton (driver);
		w.ClickOnWatch();
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		Logout log = new Logout(driver);
		log.ClickOnLogout();
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	
	
	

}

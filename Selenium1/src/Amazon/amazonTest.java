package Amazon;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonTest {

	public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
	     WebDriver driver =new ChromeDriver ();
	     
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://www.amazon.in/");
	      
	    //  driver.manage().window().maximize();
	      
	      
	      
	      amazon_signin as =new amazon_signin(driver);
	      as.ClickOnSignin();
	      
	     

	      
	      
	}

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.instagram.com/accounts/login/");
      Thread.sleep(3000);
      WebElement name= driver.findElement(By.xpath("(//input[contains (@class,'_2hvTZ pexuQ ')])[1]"));
       name.sendKeys("xvsny");
       WebElement pass= driver.findElement(By.xpath("(//input[contains (@class,'_2hvTZ pexuQ ')])[2]"));
       pass.sendKeys("xvsny12");
       Thread.sleep(3000);
       
     WebElement login= driver.findElement(By.xpath("//div[text()='Log In']"));
     login.click();
     
     boolean result = login.isEnabled();
     if(result==true)
    	 System.out.println("Login is Enabled");
     else
    	 System.out.println("Login is not Enabled");
      
	}

}

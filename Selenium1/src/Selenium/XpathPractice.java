package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
 
   driver.get("https://twitter.com/i/flow/signup");
   
   Thread.sleep(5000);
   
  WebElement xpath = driver.findElement(By.xpath("//input [@autocomplete='name']"));
  
  Thread.sleep(3000);
             xpath.sendKeys("akash");
             
   WebElement contains = driver.findElement(By.xpath(" //select[contains(@id,'SELECTOR_')]"));
             
      Thread.sleep(3000);
             contains.click();
          
             
             
    driver.navigate().to("https://en-gb.facebook.com/");
    WebElement text = driver.findElement(By.xpath(" //button[text() ='Log In']"));
    text.click();
    
    
          


	}

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
WebDriver driver =new ChromeDriver();

driver.get("https://www.flipkart.com/");
Thread.sleep(3000);
WebElement close =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
close.click();
WebElement parent =driver.findElement(By.xpath("//div[text()='Travel']"));
parent.click();
Thread.sleep(2000);

 WebElement dest=driver.findElement(By.xpath("(//input[@type ='text'])[1]"));
Thread.sleep(2000);
 Actions act = new Actions(driver);
 act.click(dest).build().perform();
 act.sendKeys(Keys.HOME).perform();
	
	Thread.sleep(2000);
	
	for(int i =1 ; i<=7; i++)
	{
		act.sendKeys(Keys.ARROW_DOWN).perform();	
	}
	
	act.sendKeys(Keys.ENTER).perform();

	}

}

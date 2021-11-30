package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropsD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	 driver.findElement(By.xpath("//input [@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	 WebElement fligth = driver.findElement(By.xpath("//a[@value='BLR']"));
	fligth.click();
	Thread.sleep(2000);

	WebElement to = driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"));
	to.click();
	
//	Actions act =new Actions(driver);
//	act.click(to).perform();
	
//	act.sendKeys(Keys.HOME).perform();
//	
//	Thread.sleep(2000);
//	
//	for(int i =1 ; i<=9; i++)
//	{
//		act.sendKeys(Keys.ARROW_DOWN).perform();	
//	}
//	
//	act.sendKeys(Keys.ENTER).perform();
	
	
	
	}

}

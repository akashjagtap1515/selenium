package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {//dropdown

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("IND");
		Thread.sleep(2000);
		
		 List<WebElement> opts = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		
		for(WebElement opt :opts)
		{
			if(opt.getText().equalsIgnoreCase("india"))
			{
				opt.click();
				break;
			}
		
		}
	}

}

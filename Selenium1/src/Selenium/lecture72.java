package Selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class lecture72 {

	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();

			String [] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
             Thread.sleep(3000);
             
             addItems(driver,itemsNeeded);
	}
	public static void addItems(WebDriver driver,String[]itemsNeeded)
	{
		int j =0;
		List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<product.size();i++)
		{
			String [] name= product.get(i).getText().split("-");
			String formattedName =name[0].trim();
			
			List itemsNeededList =Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if(j==itemsNeeded.length)
				break;
			}
		}
		
	}

}

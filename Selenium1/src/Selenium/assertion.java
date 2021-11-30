package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement psng =driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		WebElement psng1 =driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		System.out.println(psng1.getText());
		psng.click();
		
		for(int i =1 ;i<6;i++)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText();
		
		
		//Assert.asserttrue(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(),"6 Adult");
		//assertion require testng jar file ,temp not available
		}

}

package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
 WebElement email = driver.findElement(By.xpath("//input[@name='submit']"));
		 email.click();
		  		
		Thread.sleep(5000);
	
	Alert alt = driver.switchTo().alert();
	String text = alt.getText();
	System.out.println(text);
     alt.accept();
//		alt.dismiss();
	
	//alt.sendKeys("danny");

	}

}

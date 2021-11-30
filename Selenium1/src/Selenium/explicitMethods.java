package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class explicitMethods {
	


	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
     WebDriver driver =new ChromeDriver ();
     
     driver.get("https://en-gb.facebook.com/");
     
     Thread.sleep(3000);
     
     WebElement sign = driver.findElement(By.xpath("//a[text()='Create New Account']"));
     sign.click();
     
     Thread.sleep(3000);
     
     WebElement male = driver.findElement(By.xpath("  (//input[@name='sex'])[2]"));
     male.click();
     Thread.sleep(3000);
     
     boolean result1 = male.isSelected(); //is selected method
     if (result1 == true)
    	 System.out.println("male is selected");
     else
    	 System.out.println("male is Not selected");
     
      
     WebElement custom = driver.findElement(By.xpath("(//input[@name='sex'])[3]"));
     custom.click();
     Thread.sleep(3000);
     WebElement check = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
     boolean result = check.isDisplayed(); //is displayed method
     if (result == true)
    	 System.out.println("result is Displayed");
     else
    	 System.out.println("result is Not Displayed");
     
     String text = check.getAttribute("aria-label"); // getAttribute method
     System.out.println(text);
     
     String text1 =check.getText(); // getText method
     System.out.println(text1);
     
	}
	

}

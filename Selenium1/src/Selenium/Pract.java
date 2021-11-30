package Selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
	     WebDriver driver =new ChromeDriver ();
	     
	     driver.get("https://www.w3schools.com/js/js_popup.asp");
	     
	 WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
	 alert.click();
	    
	     
 ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
	     
	     driver.switchTo().window(addr.get(0));
	     String url = driver.getCurrentUrl();
	     System.out.println(addr.get(0)+  "  "+ url);
	     
	     driver.switchTo().window(addr.get(1));
	      url = driver.getCurrentUrl();
	     System.out.println(addr.get(1)+  "  "+ url);
	    
	     WebElement TryIt = driver.findElement(By.xpath("//a[text()='Get your']"));
	     TryIt.click();
ArrayList<String> addr1= new ArrayList<String>(driver.getWindowHandles());
	     
	     driver.switchTo().window(addr1.get(0));
	     String url2 = driver.getCurrentUrl();
	     System.out.println(addr1.get(0)+  "  "+ url);

	}

}

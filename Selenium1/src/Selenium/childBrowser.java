package Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowser {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
	     WebDriver driver =new ChromeDriver ();
	     
	     driver.get("https://www.w3schools.com/js/js_popup.asp");
	     
	     WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
	     WebElement confirm = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
	     WebElement prompt = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
	     WebElement vanky = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
	     
	     alert.click();
	     confirm.click();
	     prompt.click();
	     vanky.click();
	     
	     String mainpage = driver.getWindowHandle();
	     System.out.println(mainpage);
	     
	     ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
	     
	     driver.switchTo().window(addr.get(0));
	     String url = driver.getCurrentUrl();
	     System.out.println(addr.get(0)+  "  "+ url);
	     
	     driver.switchTo().window(addr.get(4));
	      url = driver.getCurrentUrl();
	     System.out.println(addr.get(4)+  "  "+ url);
	     
	     driver.switchTo().window(addr.get(3));
	      url = driver.getCurrentUrl();
	     System.out.println(addr.get(3)+  "  "+ url);
	     
	     driver.switchTo().window(addr.get(2));
	      url = driver.getCurrentUrl();
	     System.out.println(addr.get(2)+  "  "+ url);
	     
	     driver.switchTo().window(addr.get(1));
	      url = driver.getCurrentUrl();
	     System.out.println(addr.get(1)+  "  "+ url);
	}

}

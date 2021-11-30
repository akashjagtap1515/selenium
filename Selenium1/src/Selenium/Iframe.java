package Selenium;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
	     WebDriver driver =new ChromeDriver ();
	     
 driver.get("https://www.w3schools.com/js/js_popup.asp");
WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
alert.click();

ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(addr.get(1));//Switch to child browser
Thread.sleep(3000);

driver.switchTo().frame("iframeResult");//switch to specific frame

WebElement TryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
TryIt.click();

Thread.sleep(3000);
Alert alt = driver.switchTo().alert(); //alert handling
alt.accept();
Thread.sleep(3000);

driver.switchTo().defaultContent();//for main page
Thread.sleep(5000);

WebElement TryIt1 = driver.findElement(By.xpath("//a[@id='tryhome']"));
TryIt1.click();


	}

}

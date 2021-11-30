package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
	     WebDriver driver =new ChromeDriver ();
	     
	     driver.get("https://jqueryui.com/droppable/");
	     Thread.sleep(3000);
	     
	     WebElement abc = driver.findElement(By.xpath("//a[text()='Toggle']"));
	     
	     JavascriptExecutor j = ((JavascriptExecutor)driver);
	     j.executeScript("arguments[0].scrollIntoView(true);", abc);
	}

}

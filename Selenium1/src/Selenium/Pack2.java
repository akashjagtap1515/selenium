package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pack2 {
	//drag and drop

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
	     WebDriver driver =new ChromeDriver ();
	     
	     driver.get("https://jqueryui.com/droppable/");
	     Thread.sleep(3000);
	     WebElement iframe =driver.findElement(By.xpath("(//div[@id='content'])//iframe"));
	     driver.switchTo().frame(iframe);
	     Thread.sleep(3000);
	     
	     WebElement drag =driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	     WebElement drop =driver.findElement(By.xpath(" //div[@id='droppable']"));
	  
	     Actions act = new Actions(driver);
	     act.dragAndDrop(drag, drop).perform();
	}

}

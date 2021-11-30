package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class andj {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
	     WebDriver driver =new ChromeDriver ();
	     
	     driver.get("https://jqueryui.com/droppable/");
	     
 Thread.sleep(1000);
	     
	     driver.get("https://www.w3schools.com/js/js_popup.asp");
	}

}

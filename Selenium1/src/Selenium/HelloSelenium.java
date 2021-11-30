package Selenium;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
	driver.get("https://paytm.com/recharge");
	
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
	WebDriver chandu = new ChromeDriver();
chandu.get("https://www.bandicam.com/");

 Dimension d = new Dimension(800,500);
chandu.manage().window().setSize(d);


Point p = new Point (100,200);
chandu.manage().window().setPosition(p);

	}

}

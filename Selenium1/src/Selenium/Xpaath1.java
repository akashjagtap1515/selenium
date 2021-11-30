package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaath1 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/login/");
	
	
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	
	email.sendKeys("akashbudgude7709@gmail.com");
	
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys("123456@123");
	
	Thread.sleep(3000);
	
	WebElement Login = driver.findElement(By.xpath("//button[@id=\"loginbutton\"]"));
	Login.click();
	
	
	WebElement Search = driver.findElement(By.xpath("//input[@aria-label=\'Search Facebook\']"));
	Search.sendKeys("vitthal bhoskar");
	
	
	}

}

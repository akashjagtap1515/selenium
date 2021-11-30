package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pack1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
	     WebDriver driver =new ChromeDriver ();
	     
	     driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486390870450&hvpos=&hvnetw=g&hvrand=8990972505618512293&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9050526&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=CjwKCAjwh5qLBhALEiwAioods0ltjDwrZWfdcZATuwI_xS850y1P-GuD4es0R5t0CjZ0i8yv-kXRehoC8pAQAvD_BwE");
	     
	 WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	 Actions ac= new Actions(driver);

	 ac.moveToElement(move).perform();
	 
	 WebElement signIn =driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
	 ac.moveToElement(signIn).click().perform();
	}

}

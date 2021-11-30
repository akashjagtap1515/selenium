package instagram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildAmazon {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe\\");
	     WebDriver driver =new ChromeDriver ();
	     
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://www.amazon.in/");
	      
	      WebElement move=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	      Actions act = new Actions(driver);
	      act.moveToElement(move).build().perform();
	      
	      WebElement signIn = driver.findElement(By.xpath("//div[@id='nav-al-signin']//a[@class='nav-action-button']"));
	      signIn.click();
	      
	      Thread.sleep(5000);
	      driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8698251515");
	      driver.findElement(By.xpath("//input[@id='continue']")).click();

	}

}

package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screeenshot {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe\\");
WebDriver driver = new ChromeDriver();

    driver.get("https://en-gb.facebook.com/");
    
    String str = RandomString.make(2); //random method for multiple screenshot
  //  Date d =new Date();
  //  String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
    
   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   File dest =new File("E:\\Selenium\\Sceeenshot\\fb" + str+ ".jpg");
   FileHandler.copy(source, dest);
   
   
  
   
	}

	private static String RandomMethod(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}

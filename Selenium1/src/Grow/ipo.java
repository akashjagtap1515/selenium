package Grow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ipo {
	
	@FindBy (xpath= "//div[text()='IPO - Initial Public Offerings']")
	private WebElement Ipo;
	
	public ipo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnipo() {
		Ipo.click();
	}

}

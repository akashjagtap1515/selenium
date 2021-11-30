package Grow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class stocks {
	@FindBy (xpath ="//input [@id='globalSearch23']")
	private WebElement Search;
	
	@FindBy (xpath ="//div[@class='truncate clrSubText']")
	private WebElement Enter;
	
	@FindBy (xpath ="//input[@id='inputShare']")
	private WebElement Input;
	
	public stocks(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void BuyStocks() throws InterruptedException {
		Search.sendKeys("Tata Motors");
	    Enter.click();
	    Thread.sleep(2000);
	    Input.sendKeys("25");
	}

}

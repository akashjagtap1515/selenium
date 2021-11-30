package Grow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	@FindBy(xpath ="//i[text() ='keyboard_arrow_down']")
    private WebElement Logout;
	
	@FindBy (xpath="//div[@class='settingItem valign-wrapper'][4]")
	private WebElement submit;
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLogout()
	{
		Logout.click();
		submit.click();
	}
}

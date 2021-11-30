package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signOut {
	@FindBy (xpath="//a[@id='nav-link-accountList']")
	private WebElement Account;
	
	@FindBy (xpath="//span[text()='Sign Out']")
	private WebElement SignOut;
	
	public signOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnSignout()
	{
		Account.click();
		SignOut.click();
	}
}

package Amazon;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon_signin {
	WebDriver driver;
	@FindBy (xpath ="//a[@id='nav-link-accountList']")
	private WebElement Logo;
	
	@FindBy (xpath ="//div[@id='nav-al-signin']//a[@class='nav-action-button']")
	private WebElement SignIn;

	@FindBy (xpath="//input[@id='ap_email']")
	private WebElement Email;
	
	@FindBy (xpath ="//input[@id='continue']")
    private WebElement Continue;
	
	@FindBy (xpath= "//input[@id='ap_password']")
	private WebElement Password;
	
	@FindBy (xpath= "//input[@id='signInSubmit']")
	private WebElement Submit;
	
	public amazon_signin(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnSignin() throws InterruptedException  {
		 Actions act = new Actions(driver);
	      act.moveToElement(Logo).build().perform();
		SignIn.click();
		
		Thread.sleep(5000);
		Email.sendKeys("8698251515");
		Continue.click();
		Password.sendKeys("8698251515");
		Submit.click();
		

		
	}

}

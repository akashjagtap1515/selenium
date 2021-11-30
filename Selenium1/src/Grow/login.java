package Grow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	@FindBy (xpath = "//input[@id='login_email1']")
	private WebElement email;
	
	@FindBy (xpath ="//span[text()='Continue']")
    private WebElement Continue;
	
	@FindBy (xpath ="//input[@id='login_password1']")
	private WebElement Password;
	
	@FindBy (xpath ="//span[text()='Submit']")
	private WebElement Submit;
	
	@FindBy (xpath ="//input[@class='otpinput88']")
    private WebElement Pin;
	
	public login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SendLogin() 
	{
		email.sendKeys("akashjagtap1515@gmail.com");
		Continue.click();
		Password.sendKeys("Mh11bw3320@");
		Submit.click();
	
		Pin.sendKeys("3320");
	}
}

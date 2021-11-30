package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {
	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement CreateNewAccount;
	@FindBy(xpath = "//input [@name='firstname']")
	private WebElement Firstname;
	@FindBy(xpath = "//input [@name='lastname']")
	private WebElement Lastname;
	@FindBy(xpath = "//input [@name='reg_email__']")
	private WebElement Email;
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	private WebElement VerifyEmail;
	@FindBy(xpath = "//input [@id='password_step_input']")
	private WebElement Password;
	@FindBy(xpath = "//select [@id='day']")
	private WebElement Day;
	@FindBy(xpath = "//select [@id='month']")
	private WebElement Month;
	@FindBy(xpath = "//select[@id='year']")
	private WebElement Year;
	@FindBy(xpath = "(//input [@name='sex'])[2]")
	private WebElement Male;
	@FindBy(xpath = "(//button[text() ='Sign Up'])[1]")
	private WebElement Signup;

	public NewAccount(WebDriver driver) {
       
		PageFactory.initElements(driver, this);
	}

	public void clickOnCreateNewAccount() {
		CreateNewAccount.click();
	}

	public void sendFirstname() {
		Firstname.sendKeys("Akash");
	}

	public void sendLastname() {
		Lastname.sendKeys("jagtap");
	}

	public void sendEmail() {
		Email.sendKeys("himanshujagtap1515@gmail.com");
	}

	public void sendVerifyEmail() {
		VerifyEmail.sendKeys("himanshujagtap1515@gmail.com");
	}

	public void sendPassword() {
		Password.sendKeys("akash123@");
	}

	public void clickOnDay() {
		Select s = new Select(Day);
		s.selectByVisibleText("1");
	}

	public void clickOnMonth() {
		Select s1 = new Select(Month);
		s1.selectByVisibleText("Jun");
	}

	public void clickOnYear() {
		Select s2 = new Select(Year);
		s2.selectByVisibleText("1996");
	}

	public void clickOnMale() {
		Male.click();
	}

	public void clickOnSignup() {
		Signup.click();
	}
}
package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GLAccountspage {
	
	WebDriver driver;
	
	public GLAccountspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//*[@name='account_code']")
	private WebElement Accountcode;
	
	@FindBy(xpath="//*[@name='account_code2']")
	private WebElement Accountcode2;
		
	@FindBy(xpath="//*[@name='account_name']")
	private WebElement Accountname;
	
	@FindBy(xpath="//*[@name='account_type']")
	private WebElement accountgroup;
	
	@FindBy(xpath="//*[@name='account_tags[]']")
	private WebElement accounttags;
	
	@FindBy(xpath="//*[@name='inactive']")
	private WebElement accountstatus;
	
	@FindBy(xpath="//*[text()='Add Account']")
	private WebElement AddGLAccount;
	
	@FindBy(xpath="//*[text()='Back']")
	private WebElement Back;
	
	public WebElement Accountcode() {
		return Accountcode;
	}
	
	public WebElement Accountcode2() {
		return Accountcode2;
	}

	public WebElement Accountname() {
		return Accountname;
	}

	public WebElement Accountgroup() {
		return accountgroup;
	}
	
	public WebElement Accounttags() {
		return accounttags;
	}

	public WebElement Accountstatus() {
		return accountstatus;
	}
	
	public WebElement GLAddaccountbutton() {
		return AddGLAccount;
	}

	public WebElement Backbutton() {
		return Back;
	}


}

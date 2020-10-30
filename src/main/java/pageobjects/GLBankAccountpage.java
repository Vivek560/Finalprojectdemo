package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GLBankAccountpage {

	WebDriver driver;
	
	public GLBankAccountpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="bank_account_name")
	private WebElement BankAccountName;
	
	@FindBy(name="account_type")
	private WebElement AccountType;
	
	@FindBy(name="BankAccountCurrency")
	private WebElement BankAccountCurrency;
	
	@FindBy(name="dflt_curr_act")
	private WebElement Defaultcurrencyaccount;
	
	@FindBy(name="account_code")
	private WebElement AccountGLcode;
	
	@FindBy(id="bank_charge_act")
	private WebElement ChargesAccount;
	
	@FindBy(xpath="//*[@name='bank_name']")
	private WebElement Bankname;
	
	@FindBy(xpath="//*[@name='bank_account_number']")
	private WebElement BankAccountnumber;
	
	@FindBy(xpath="//*[@name='bank_address']")
	private WebElement BankAddress;
	
	
	@FindBy(xpath="//*[text()='Add new']")
	private WebElement Addnew;
	
	@FindBy(linkText="Back")
	private WebElement Back;
	
	public WebElement BankAccountNameField() {
		return BankAccountName;
	}
	
	public WebElement AccountType() {
		return AccountType;
	}
	
	public WebElement BankAccountCurrency() {
		return BankAccountCurrency;
	}
	
	public WebElement Defaultcurrencyaccount() {
		return Defaultcurrencyaccount;
	}

	public WebElement AccountGLCode() {
		return AccountGLcode;
	}
	
	public WebElement ChargesAccount() {
		return ChargesAccount;
	}
	
	public WebElement BanknameField() {
		return Bankname;
	}
	
	public WebElement BankAccountnumber() {
		return BankAccountnumber;
	}

	public WebElement BankAddressField() {
		return BankAddress;
	}
	
	public WebElement Addnewbutton() {
		return Addnew;
	}
	
	public WebElement Backlink() {
		return Back;
	}
}

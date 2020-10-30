package Bankingandgeneralledger;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.GLBankAccountpage;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Logoutpage;
import resources.Base;

public class GLBankAccountTest extends Base{
	
	WebDriver driver;
	
	@BeforeClass
	public void LaunchBrowser() throws IOException {
		
		driver=Initializedriver();
		driver.get(prop.getProperty("url"));
	}

	@Test(priority=1)
	public void Login() {
		Loginpage login=new Loginpage(driver);
		login.username().sendKeys(prop.getProperty("username"));
		login.password().sendKeys(prop.getProperty("password"));
		login.Loginbutton().click();
	}
	
	@Test(priority=2)
	public void AddBankAccounts() throws InterruptedException {
		Homepage home=new Homepage(driver);
		home.Bankingandgeneralledger().click();
		home.BankAccount().click();
		
		GLBankAccountpage bankaccount=new GLBankAccountpage(driver);
		bankaccount.BankAccountNameField().sendKeys(prop.getProperty("GLBankAccountname"));
		
		WebElement Accounttype=bankaccount.AccountType();
		Select Accounttypedropdown=new Select(Accounttype);
		Accounttypedropdown.selectByVisibleText(prop.getProperty("BankGLAccounttype"));
		
		WebElement BankAccount=bankaccount.BankAccountCurrency();
		Select BankAccountdropdown=new Select(BankAccount);
		BankAccountdropdown.selectByVisibleText(prop.getProperty("GLAccountcurrency"));
		
		WebElement defaultcurrency=bankaccount.Defaultcurrencyaccount();
		Select defaultcurrencydropdown=new Select(defaultcurrency);
		defaultcurrencydropdown.selectByVisibleText(prop.getProperty("GLdefaultcurrency"));
		
		WebElement GLcode=bankaccount.AccountGLCode();
		Select GLcodedropdown=new Select(GLcode);
		GLcodedropdown.selectByVisibleText(prop.getProperty("GLAccountcode"));
		
		WebElement chargesaccount=bankaccount.ChargesAccount();
		Select chargesaccountdropdown=new Select(chargesaccount);
		chargesaccountdropdown.selectByVisibleText(prop.getProperty("GLchrageAccount"));
		
		bankaccount.BanknameField().sendKeys(prop.getProperty("GLname"));
		bankaccount.BankAccountnumber().sendKeys(prop.getProperty("GLBankAccountnumber"));
		bankaccount.BankAddressField().sendKeys(prop.getProperty("GLBankaddress"));
	
		bankaccount.Addnewbutton().click();
		Thread.sleep(3000);
		bankaccount.Backlink().click();
		
	}	                             
	
	@Test(priority=3)
	public void Logout() {
		Logoutpage logout=new Logoutpage(driver);
		logout.Logout().click();
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}


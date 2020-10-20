package Bankingandgeneralledger;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.GLAccountspage;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Logoutpage;
import resources.Base;

public class GLAccountTest extends Base {

	WebDriver driver;
	
	@BeforeClass
	public void Launchbrowser() throws IOException {
		
		driver=Initializedriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test(priority=1)
	public void login() {
		Loginpage login=new Loginpage(driver);
		login.username().sendKeys(prop.getProperty("username"));
		login.password().sendKeys(prop.getProperty("password"));
		login.Loginbutton().click();
	}

	@Test(priority=2)
	public void AddGLAccount() throws InterruptedException {
		Homepage home=new Homepage(driver);
		home.Bankingandgeneralledger().click();
		home.GLAccounts().click();
	
		GLAccountspage addaccount=new GLAccountspage(driver);
		addaccount.Accountcode().sendKeys(prop.getProperty("accountcode"));
		addaccount.Accountcode2().sendKeys(prop.getProperty("accountcode2"));
		addaccount.Accountname().sendKeys(prop.getProperty("accountname"));
		
		WebElement acountgroupdropdown=addaccount.Accountgroup();
		Select accountgroup=new Select(acountgroupdropdown);
		accountgroup.selectByVisibleText(prop.getProperty("accountgroup"));
		
		WebElement Accounttags=addaccount.Accounttags();
		Select Accounttagscombobox=new Select(Accounttags);
		Accounttagscombobox.selectByVisibleText(prop.getProperty("accounttags"));
		
		WebElement Accountstatus=addaccount.Accountstatus();
		Select Accountstatusdropdown=new Select(Accountstatus);
		Accountstatusdropdown.selectByValue(prop.getProperty("accountstatus"));
		
		addaccount.GLAddaccountbutton().click();
		Thread.sleep(3000);
		addaccount.Backbutton().click();
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

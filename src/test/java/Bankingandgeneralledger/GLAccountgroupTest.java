package Bankingandgeneralledger;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.GLAccountgroupspage;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Logoutpage;
import resources.Base;

public class GLAccountgroupTest extends Base {

	WebDriver driver;
	
	@BeforeClass
	public void LaunBrowser() throws IOException {
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
	public void Accountgroups() throws InterruptedException {
	Homepage home=new Homepage(driver);
	home.Bankingandgeneralledger().click();
	home.GLAccountsGroup().click();
	
	GLAccountgroupspage GLAccount=new GLAccountgroupspage(driver);
	Thread.sleep(2000);
	GLAccount.ID().sendKeys(prop.getProperty("ID"));
	Thread.sleep(2000);
	GLAccount.name().sendKeys(prop.getProperty("Name"));
	
	WebElement Subgroup=GLAccount.SubGroup();
	Select Subgroupdropdown=new Select(Subgroup);
	Subgroupdropdown.selectByVisibleText(prop.getProperty("Subgroup"));
	
	WebElement Class=GLAccount.Classdropdown();
	Select Classdropdown=new Select(Class);
	Classdropdown.selectByVisibleText(prop.getProperty("Class"));
	
	GLAccount.Addbutton().click();
	Thread.sleep(2000);
	GLAccount.Backbutton().click();
	}
	
	@Test(priority=3)
	public void Logout() {
	Logoutpage logout=new Logoutpage(driver);
	logout.Logout().click();
	
	}

	@AfterClass
	public void Teardown() {
	driver.close();
	}

}

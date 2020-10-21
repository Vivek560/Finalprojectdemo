package Bankingandgeneralledger;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.GLAccountsclasses;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Logoutpage;
import resources.Base;

public class GLAccountclassTest extends Base {
	
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
	public void AddGLAccountclasses() throws InterruptedException {
	Homepage home=new Homepage(driver);
	home.Bankingandgeneralledger().click();
	home.GLAccountClasses().click();

	GLAccountsclasses GLAccountclass=new GLAccountsclasses(driver);
	GLAccountclass.ID().sendKeys(prop.getProperty("GLAccountclassID"));
	GLAccountclass.name().sendKeys(prop.getProperty("GLAccountclassName"));
	Thread.sleep(3000);
	WebElement classtype=GLAccountclass.classtype();
	Select classtypedropdown=new Select(classtype);
	classtypedropdown.selectByVisibleText(prop.getProperty("GLAccountType"));
	
	GLAccountclass.Addbutton().click();
	Thread.sleep(3000);
	GLAccountclass.Back().click();
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
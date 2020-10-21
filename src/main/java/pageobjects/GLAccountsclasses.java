package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GLAccountsclasses {
	
	WebDriver driver;
	
	public GLAccountsclasses(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="id")
	private WebElement GLAccountclassID;
	
	@FindBy(name="name")
	private WebElement GLAccountclassname;
	
	@FindBy(name="ctype")
	private WebElement classtype;
	
	@FindBy(xpath="//*[text()='Add new']")
	private WebElement Addbutton;
	
	@FindBy(xpath="//*[text()='Back']")
	private WebElement Back;
	
	public WebElement ID() {
	return GLAccountclassID;
	}

	public WebElement name() {
	return GLAccountclassname;	
	}

	public WebElement classtype() {
	return classtype;	
	}

	public WebElement Addbutton() {
	return Addbutton;	
	}

	public WebElement Back() {
	return Back;	
	}
}

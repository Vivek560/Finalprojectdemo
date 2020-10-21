package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GLAccountgroupspage {
	
		WebDriver driver;
	
	public GLAccountgroupspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="id")
	private WebElement ID;
	
	@FindBy(name="name")
	private WebElement name;
	
	@FindBy(name="parent")
	private WebElement SubGroup;

	@FindBy(name="class_id")
	private WebElement Classdropdown;
	
	@FindBy(xpath="//*[text()='Add new']")
	private WebElement Addbutton;
	
	@FindBy(xpath="//*[text()='Back']")
	private WebElement Back;
	
	public WebElement ID() {
	return ID;
	}

	public WebElement name() {
	return name;
	}

	public WebElement SubGroup() {
	return SubGroup;	
	}

	public WebElement Classdropdown() {
	return Classdropdown;
	}
	
	public WebElement Addbutton() {
	return Addbutton;
	}

	public WebElement Backbutton() {
	return Back;
	}
}

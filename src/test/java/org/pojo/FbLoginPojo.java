package org.pojo;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass{
	
	// Step 1 : Non-Parameterized constructor
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	// Step 2  : Private web elements
/*	@FindBy(id = "email")
	private WebElement email;*/
	
	@FindAll({
		@FindBy(xpath = "//input[@id='email']"),
		@FindBy(xpath = "//input[@name='email']"),
		@FindBy(xpath = "//input[@data-testid='royal_email']")
	})
	private WebElement email;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement loginBtn;


	
	// Step 3 : Getters to access web elements outside class
/*	public WebElement getEmail() {
		return email;
	}*/

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	
}

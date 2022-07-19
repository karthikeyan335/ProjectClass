package org.facebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class Registration extends BaseClass {
	
	public Registration() {

	PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement btnCreate;
	
	@FindBy(name="firstname")
	private WebElement firstName;
	
	@FindBy(name="lastname")
	private WebElement lastName;
	
	@FindBy(name="reg_email__")
	private WebElement mobileNo;
	
	@FindBy(name="reg_passwd__")
	private WebElement newPassword;

	@FindBy(name="websubmit")
	private WebElement btnSignup;

	public WebElement getBtnCreate() {
		return btnCreate;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}
	
	public WebElement getBtnSignup() {
		return btnSignup;
	}
	
	
}

package com.flipkart.pomRepository;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.baseClass.Base_Execution;

public class LoginPage extends Base_Execution {

	/**
	 * 	Defining Elements/Page Objects
	 */
	
	@FindBy(xpath="//span[contains(text(),'Email')]/../..//input")	
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//span[text()='Login']/../..//button")
	WebElement loginButton;
	
	@FindBy(xpath="//button[text()='✕']/..//button[text()='✕']")
	WebElement cancelButton;
	
	@FindBy(xpath="//span[text()='Login']/../../..//div//span/span[text()='Login']")
	WebElement loginWindowTitle;

	
	/**
	 * This Constructor is used to initialize the Page Objects
	 * @throws IOException
	 */
	
	public LoginPage() throws IOException
	{
	
		PageFactory.initElements(driver, this);
	}
	
	
	/**
	 *  Defining Actions on Login Page
	 */
	
	
	/**
	 * This action is used to login into User's Account
	 * @param un
	 * @param pwd
	 * @throws InterruptedException
	 */

	public void loginIntoAccount(String un, String pwd) throws InterruptedException
	
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
	}
	
	
	
	public void cancelLogin()
	{
		cancelButton.click();
	}

	
	public String validateLoginWindowTitle()
	{
		 return loginWindowTitle.getText();
		 
	}
	
	
}

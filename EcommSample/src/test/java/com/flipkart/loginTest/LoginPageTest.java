package com.flipkart.loginTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.flipkart.baseClass.Base_Execution;
import com.flipkart.pomRepository.LoginPage;

public class LoginPageTest extends Base_Execution {

	public static LoginPage loginPage;

	public LoginPageTest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setUp() throws IOException {
		
		Initialization();

		loginPage = new LoginPage();
	}

	
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException 
	 
	{
	  loginPage.loginIntoAccount(pobj.getProperty("username"),pobj.getProperty("password"));
	  
	}
	 

	 @Test(priority=3) 
	 public void cancelLoginTest() 
	 { 
		 loginPage.cancelLogin(); 
	}
	 

	@Test(priority=2) 
	public void loginWindowLogoTest() {

		String Title = loginPage.validateLoginWindowTitle();

		Assert.assertEquals(Title, "Login");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

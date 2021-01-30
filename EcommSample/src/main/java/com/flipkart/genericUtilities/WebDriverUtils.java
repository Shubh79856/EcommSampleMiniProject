package com.flipkart.genericUtilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.flipkart.baseClass.Base_Execution;

/**
 * This class is used to access the WebDriver reusable utilities
 * @author Shubham
 *
 */


public class WebDriverUtils extends Base_Execution {
	
	static int Implicit_Wait_sec = 20;
	

	public WebDriverUtils() throws IOException {
		super();
		
	}


	/**
	 * used to POLL for element while loading the DOM document
	 * @param driver
	 */
	
	public void waitToLoadPage(WebDriver driver)
	
	{
		driver.manage().timeouts().implicitlyWait(Implicit_Wait_sec, TimeUnit.SECONDS);
		
	}
	
	/**
	 * Used to maximize the window of the Browser
	 * @param driver
	 */
	
	public void maximizeTheWindow(WebDriver driver) 
	
	{
		
		driver.manage().window().maximize();
		
	}
	
}

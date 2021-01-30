package com.flipkart.baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.flipkart.genericUtilities.WebDriverUtils;

/**
 * This class is used for the execution
 * @author Shubham
 *
 */
public class Base_Execution {

	
	public static WebDriver driver;
	public static WebDriverUtils wbUtil;
	public static FileInputStream fis;
	public static Properties pobj;
	//public static PropertyFileUtil propUtil;
	
	public Base_Execution() throws IOException {
		
		fis = new FileInputStream("./testData./CommonData.properties");
		 pobj= new Properties();
		pobj.load(fis);
		
	}
	

	
	public void Initialization() throws IOException
	{
		wbUtil=new WebDriverUtils();
		
		
		if(pobj.getProperty("browser").equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		
		else if (pobj.getProperty("browser").equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
//		else
//		{
//			driver= new ChromeDriver();
//		}
		
		
		wbUtil.maximizeTheWindow(driver);
		wbUtil.waitToLoadPage(driver);
		driver.get(pobj.getProperty("url"));
		
		
	}





	
	
}

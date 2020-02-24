package com.crm.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.beust.jcommander.Parameters;


public class BaseTest implements IAutoConsts {
	public static WebDriver driver;
	FileLib fLib;

	WebDriverCommenMeth wdcl;

	
	
	
	@BeforeTest
	@Parameters("browser")
	
	public void browsers(String browser) throws Throwable
	{
		fLib=new FileLib();
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(fLib.getPropKeyValue(PROP_PATH, "url"));
			driver.manage().window().maximize();
			
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(fLib.getPropKeyValue(PROP_PATH, "url"));
		
			
		}
	}
	
	
	
	
	

	


//	@BeforeClass
//	public void openBrowser() throws Throwable {
//		fLib=new FileLib();
//
//		
//		String browserValue = fLib.getPropKeyValue(PROP_PATH, "browser");
//
//		if(browserValue.equalsIgnoreCase("chrome")) {
//
//
//			System.setProperty(CHROME_KEY, CHROME_VALUE);
//			driver=new ChromeDriver();
//
//
//
//		}
//		else if(browserValue.equalsIgnoreCase("firefox")) {
//
//			driver=new FirefoxDriver();	
//
//		}
//		else 
//		{
//			Reporter.log("Enter the valid browser",true);
//		}
//
//		wdcl=new WebDriverCommenMeth();
//		wdcl.maximize();
//		
//		
//	
//		driver.get(fLib.getPropKeyValue(PROP_PATH, "url"));
//
//	}
//	
	
	
	
	
	
	


}
 

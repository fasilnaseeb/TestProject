package com.crm.TestScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;

public class LoginPag {
	
	
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement unTB;
	
public void setUsername(String un) throws Throwable {
		
		unTB.sendKeys(un);
		
	}

 
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwTB;
	
	public void setPassword(String pwd) throws Throwable {
		pwTB.sendKeys(pwd);
		
	}
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement clLB;
	
	public void clickLoginBtn(){
		
		clLB.click();
		
	}
	

	public LoginPag(){
		PageFactory.initElements(BaseTest.driver, this);
	}


	
	
		
	
	
	
	
}

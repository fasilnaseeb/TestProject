package com.crm.TestMeths;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.TestScript.LoginPag;
@Listeners(com.crm.GenericLib.MyListeners.class)
public class LoginTestScripts extends BaseTest {

	LoginPag lp;
	
	
	//@Test
	public void meth() {
		Reporter.log("Test runner1",true);
	}

	
	
    @Test
	public void loginTest() throws Throwable {
		
		
		lp=new LoginPag();
		
		
		
		lp.setUsername("admin");
		lp.setPassword("manager");
		lp.clickLoginBtn();
	
		Thread.sleep(2000);
		
	
	}
	
	// @Test(dataProvider = "abc", dataProviderClass = DataProviderClass.class)
	   public void testMethod(String un,String pw) throws Throwable {
		
		
		System.out.println(un+pw);
		
		lp=new LoginPag();
		
		lp.setUsername(un);
		lp.setPassword(pw);
		lp.clickLoginBtn();
		Thread.sleep(2000);
		
	      
	   }
	   
	   //@Test(groups = "Smoke")
	   public void methtest1() {
		   
		   
		   Reporter.log("smoke",true);
		   
	   }
	  // @Test(groups = "Reg")
      public void methtest2() {
		   
    	  Reporter.log("Regression",true);
	   }
	  // @Test(groups = "Smoke")
      public void methtest3() {
    	  Reporter.log("smoke",true);
	   
 }
     @Test
	public void  methtest() {
		
		Reporter.log("Test",true);
	}
	
	
	
}

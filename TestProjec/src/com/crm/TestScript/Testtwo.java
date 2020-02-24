package com.crm.TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;

public class Testtwo extends BaseTest {

	
	@Test
	public void meth1() {
		Reporter.log("Test runner3",true);
	}
	
	@Test
	public void meth0() {
		Reporter.log("Test runner3:3",true);
	}
	
	
}

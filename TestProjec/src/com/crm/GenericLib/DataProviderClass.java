package com.crm.GenericLib;

import org.testng.annotations.DataProvider;

public class DataProviderClass {


   @DataProvider(name="abc")
	public Object[][] credential(){
		
		Object[][] obj=new Object[][]
				{
			
			{"admin1","manager1"},
			{"admin2","manager2"},
			{"admin3","manager3"}
			
				};
				
		return obj;
		
	}
   
   

	
	
}

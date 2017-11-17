package com.facebook.tests;

import org.testng.annotations.Test;
import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.facebook.pages.Loginpage;
import com.facebook.utils.TestUtil;

public class LoginpageTest extends TestBase {
	
	@DataProvider
	public Object[][] getLoginData(){
		return TestUtil.getData("LoginSheet", null);
		
	}
	
	@Test(dataProvider="getLoginData")
	public void validLogin(Hashtable<String, String> data){
		Loginpage valid = PageFactory.initElements(driver,Loginpage.class);
		valid.doLogin(data.get("UserName"), data.get("Password"));
		
	}
	
	
	

}

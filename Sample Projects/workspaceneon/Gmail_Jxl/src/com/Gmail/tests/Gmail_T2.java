package com.Gmail.tests;

import static org.testng.Assert.assertTrue;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Gmail.Pages.Gmail_P1;

import junit.framework.Assert;

public class Gmail_T2 {
	WebDriver driver;

	@Test(dataProvider="logindata")
	public void loginInto(uname,pass) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\sw\\softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		Gmail_P1 init = PageFactory.initElements(driver, Gmail_P1.class);
		
		init.gmailLogin(username=uname, password);
		assertTrue(driver.getTitle().equalsIgnoreCase("Enter your password"),"invalidlogin");
		System.out.println("valid login");

	}

	@DataProvider(name = "logindata")
	public Object[][] passdata() {
		// declaration
		Object[][] data = new Object[3][2];
		data[0][0] = "valpadas";
		data[0][1] = "venu";

		data[1][0] = "valpadasanusha";
		data[1][1] = "venuanu123";

		data[2][0] = "fghjkk";
		data[2][1] = "venuanu";
		
		return data;

	}

}

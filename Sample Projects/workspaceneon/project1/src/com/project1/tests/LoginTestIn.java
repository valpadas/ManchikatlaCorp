package com.project1.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.project1.pages.LoginIn;

public class LoginTestIn {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\sw\\softwares\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_login_form_modal");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(2000);
		LoginIn initElements = PageFactory.initElements(driver,LoginIn.class);
		initElements.validLogin("Bangaram","anusha");
		
	}

}

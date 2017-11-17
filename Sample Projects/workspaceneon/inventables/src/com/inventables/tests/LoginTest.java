package com.inventables.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.inventables.pages.LoginPage;

public class LoginTest extends LoginPage{
	
	public LoginTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\sw\\softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.inventables.com");
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		page.validLogin();

	}

}

package com.Gmail.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Gmail_P1 {
	WebDriver driver;

	public Gmail_P1(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(xpath = "//input[@id='identifierId'][@type='email']")
	WebElement username;

	@FindBy(xpath = "//span[contains(@class,'RveJvd snByac')]")
	WebElement nextbutton;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//span[contains(@class,'RveJvd')]")
	WebElement next2;

	public void gmailLogin(String username,String password)throws Exception{
		this.username.sendKeys(username);
		nextbutton.click();
		Thread.sleep(2000);
		this.password.sendKeys(password);
		next2.click();
		
		
	}
}

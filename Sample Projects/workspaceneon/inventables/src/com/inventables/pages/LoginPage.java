package com.inventables.pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.inventables.utils.ExcelReader;

import jxl.read.biff.BiffException;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = ".//*[@id='main-nav-bar']/ul/li[1]/a")
	WebElement login_link;

	@FindBy(xpath = ".//*[@id='customer_type_returning']")
	WebElement radio_button;

	@FindBy(xpath = ".//*[@id='user_email']")
	WebElement email;

	@FindBy(xpath = ".//*[@id='user_password']")
	WebElement password;

	@FindBy(xpath = ".//*[@id='login-button']")
	WebElement continue_button;

	public void validLogin() {
		login_link.click();
		radio_button.click();
		ExcelReader excel = new ExcelReader();
		try {
			HashMap<String, String> map = excel.reader();
			

			for (String key : map.keySet()) {
				String pwd = map.get(key);
				this.email.sendKeys(key);
				this.password.sendKeys(pwd);
				continue_button.click();
				if(driver.findElement(By.xpath(".//*[@id='main-nav-bar']/ul/li[1]/a")).getText()
						.equalsIgnoreCase("Log In")){
				continue;
				}
				else{
					break;
				}
					
			}
			

			
			System.out.println(map+"********");

		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

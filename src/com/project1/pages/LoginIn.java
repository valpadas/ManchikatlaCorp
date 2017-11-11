package com.project1.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginIn {
	public WebDriver driver;

	public LoginIn(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "fromPlaceName")
	WebElement FromLocation;

	@FindBy(xpath = "//*[@id='toPlaceName']")
	WebElement ToLocation;

	@FindBy(xpath = "//*[@id='txtJourneyDate']")
	WebElement Depart;

	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[1]/a")
	WebElement date;

	@FindBy(xpath = "//*[@id='searchBtn']")
	WebElement Button;
	
	public void validateLogin() {
		try {
			Actions a = new Actions(driver);
			CharSequence key = "Hyderabad";
			Actions ele = a.sendKeys(FromLocation, key);
			ele.build().perform();
			ele.sendKeys(Keys.ENTER).build().perform();

			Actions ele1 = a.sendKeys(ToLocation, "shiridi");
			ele1.build().perform();
			ele1.sendKeys(Keys.ENTER).build().perform();
			Depart.click();
			date.click();
			Button.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

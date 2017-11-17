package com.facebook.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.xml.ISuiteParser;



public class Loginpage {
	  Logger APPLICATION_LOGS = Logger.getLogger(Loginpage.class);
	public WebDriver driver;
	
	public Loginpage(WebDriver driver){
		this.driver=driver;
		}
	@FindBy(id="email")
	public WebElement Email;
	
	@FindBy(xpath="//form[@id='login_form']/table/tbody/tr[2]/td[2]/input")
	public WebElement password;
	
	@FindBy(xpath="//label[@id='loginbutton']/input")
	public WebElement login_Button;
	
	@FindBy(xpath="//div[@id='header_block']/span/div/div[2]/a")
    public WebElement error_Element;
	
	@FindBy(xpath="//div[@id='loginform']/div/input")
	public WebElement another_email ;
	
	@FindBy(xpath="//*[@id='pass']")
	public WebElement another_pass;
	
	@FindBy(xpath="//*[@id='loginbutton']")
	public WebElement login;
	
	public void doLogin(String email,String password){
		Email.sendKeys(email);
		this.password.sendKeys(password);
		login_Button.click();
		//APPLICATION_LOGS.info("login successfully");
		String expected="Not you?";
		if(error_Element.getText().contains(expected)){
			boolean iselementpresent=isElementPresent(driver,By.xpath("//div[@id='loginform']/div/input") );
			
			if(iselementpresent==true){
				another_email.sendKeys(email);
			}
			
	    boolean ispasswordexists= isElementPresent(driver,By.xpath("//*[@id='pass']"));
	    if(ispasswordexists==true){
	    	another_pass.sendKeys(password);
	    	 }
	    login.click();
	    
		}
			
	}
		public boolean isElementPresent(WebDriver driver,By locator){
			try{			
			driver.findElement(locator);
			return true;}
			catch(Exception e){
				return false;
			}
			
		}
		
		
}
	
	



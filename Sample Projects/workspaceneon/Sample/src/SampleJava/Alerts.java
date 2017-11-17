package SampleJava;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","D:\\sw\\softwares\\chromedriver.exe");
			WebDriver d=new ChromeDriver();//launch the browser
			//d.get("https://retail.onlinesbi.com/retail/login.htm");
			d.manage().window().maximize();//maximize the browser
			d.get("https://retail.onlinesbi.com/retail/login.htm");
			d.findElement(By.className("login_button")).click();
			//click on login button
			d.findElement(By.id("Button2")).click();
			Thread.sleep(2000);
			//handle alert
			d.switchTo().alert().accept();
			d.findElement(By.id("username")).sendKeys("bangaram"); 
			//verify alextert
			Alert a= d.switchTo().alert();
			String actualtext=a.getText();
			String expectedtext="Enter password";
			if(expectedtext.equalsIgnoreCase(actualtext))
			{
				//handle alert  and select password
				a.accept();
				
			}
			
			
			
			
		}

		
			
			

	}



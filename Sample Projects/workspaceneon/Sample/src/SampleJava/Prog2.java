package SampleJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prog2 {
	
		
		static WebDriver a;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\workspace\\softwares\\chromedriver.exe");
			a=new ChromeDriver();
			a.get("https://www.easypolicy.com/");
			a.findElement(By.className("limr")).click();
			a.findElement(By.className("landing-selectcontainer2 l-a2 md-input-has-placeholde")).click();
			a.findElement(By.xpath("//div[@id='fh5co-page']/div/div[2]/div/div/div/div/md-input-container")).click();
			
			a.findElement(By.xpath("//div[@id='fh5co-page']/div/div[2]/div/div/div/div/md-input-container/input")).sendKeys("AP16AW5555");
			Thread.sleep(1000);
			a.findElement(By.xpath("//md-radio-button[@id='radio_4']/div/div")).click();
			Thread.sleep(5000);
			a.findElement(By.xpath("//md-radio-button[@id='radio_7']/div/div")).click();
			WebDriverWait w=new WebDriverWait(a,10);
			w.until(ExpectedConditions.invisibilityOf(a.findElement(By.xpath("//div[@id='fh5co-page']/div/div[2]/div/div/div/div[3]/md-input-container"))));
			
			a.findElement(By.className("quotesbtn1 proceedBtn")).click();
			
			
		}

	}


package SampleJava;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleDropdownSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\sw\\softwares\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		d.findElement(By.name("firstname")).sendKeys("anusha");
		
		d.findElement(By.name("lastname")).sendKeys("manchikatla");
		d.findElement(By.id("sex-1")).click();
		WebElement findElement = d.findElement(By.xpath("//div[@id='content']/form/fieldset/div[3]"));
		List<WebElement> findElements = findElement.findElements(By.tagName("input"));
		for (WebElement webElement : findElements) {
			webElement.click();}
			//Thread.sleep(5000);}
			//WebDriverWait w=new WebDriverWait(d,10);
			//w.until(ExpectedConditions.presenceOfElementLocated(By.id("exp-6")));
			//WebElement findElement2 = webElement.findElement(By.id("exp-6"));
			//if (webElement.equals(findElement2)){
				
			//System.out.println("break");}
			d.findElement(By.id("datepicker")).sendKeys("7/6/2017");
			d.findElement(By.id("profession-0")).click();
			d.findElement(By.id("profession-1")).click();

		}

	}
	



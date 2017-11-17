package SampleJava;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoitFileupload {
	public static void main(String[] args) throws Exception{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\sw\\softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/fileupload.html");
		driver.findElement(By.xpath(".//*[@id='1']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\script2.exe");
		
		
	}

}

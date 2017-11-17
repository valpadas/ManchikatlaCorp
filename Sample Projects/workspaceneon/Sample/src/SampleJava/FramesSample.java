package SampleJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesSample {

	public static void main(String[] args) throws InterruptedException {
    
	System.setProperty("webdriver.chrome.driver", "D:\\sw\\softwares\\chromedriver.exe");
	 WebDriver a=new ChromeDriver();
	 a.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	 
	 Thread.sleep(5000);
		
	a.switchTo().frame("classFrame");
	a.findElement(By.linkText("Deprecated")).click();
	
	
	//Thread.sleep(2000);
	
	// a.switchTo().frame("null");
	 //a.navigate().refresh();
	// a.switchTo().frame("packageListFrame");
	 //a.findElement(By.linkText("com.thoughtworks.selenium")).click();
	//a.switchTo().frame("null");
	// a.navigate().refresh();
	// Thread.sleep(2000);
	// a.switchTo().frame("classFrame");
	// a.findElement(By.linkText("Deprecated")).click();
		
		
	 
	

	}

}

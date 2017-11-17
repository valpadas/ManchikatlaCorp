package SampleJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window2 {
	public static void main(String[] args) throws InterruptedException {
	    
		System.setProperty("webdriver.chrome.driver", "D:\\sw\\softwares\\chromedriver.exe");
		 WebDriver a=new ChromeDriver();
		 a.get("http://www.hdfcbank.com/");
		 String mainpage=a.getWindowHandle();
		 
		 

	}}
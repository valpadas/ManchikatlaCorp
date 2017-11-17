package SampleJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\sw\\softwares\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("http://www.jobants.com/");
		//String mainwindow=a.getWindowHandle();
		
	}

}

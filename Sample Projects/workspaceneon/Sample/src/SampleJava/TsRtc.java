package SampleJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TsRtc {
	public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "D:\\sw\\softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://tsrtconline.in/oprs-web/");
	driver.findElement(By.xpath(".//*[@id='fromPlaceName']")).sendKeys("hyderabad");

}
}
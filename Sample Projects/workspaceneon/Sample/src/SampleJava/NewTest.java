package SampleJava;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;

	@BeforeClass
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", "D:\\sw\\softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://tsrtconline.in/oprs-web/");

	}

	@Test
	public void searchForBusTickets() {
		driver.findElement(By.xpath(".//*[@id='fromPlaceName']")).sendKeys("hyderabad");

	}

	@AfterClass
	public void afterClass() {
	}

}

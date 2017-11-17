package SampleJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SimpleProg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\sw\\softwares\\chromedriver.exe");
		WebDriver d;
		d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions actions = new Actions(d);
		actions.moveToElement(d.findElement(By.xpath("//*[@id='nav-link-shopall']/span[1]"))).pause(2000)
				.moveToElement(d.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[5]/span"))).pause(2000)
				.moveToElement(
						d.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[3]/div[5]/div[1]/div/a[1]/span")))
				.click().build().perform();
		// clicking on tv features check box
		Thread.sleep(3000);

		d.findElement(By.xpath("//*[@id='leftNav']/ul[5]/div/li[1]/span/span/div/label/span/span")).click();
		// clicking on screen size check box
		Thread.sleep(2000);

		d.findElement(By.xpath("//*[@id='leftNavContainer']/ul[5]/div/li[1]/span/span/div/label/span/span")).click();
		// clicking on display technology check box
		WebElement displaytechnology = d.findElement(By.xpath("//*[@id='leftNavContainer']/ul[6]/div/li[1]/span/span/div/label/span/span"));
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("scroll(0,200);");
		js.executeScript("arguments[0].click();", displaytechnology);
				
        d.findElement(By.xpath("//*[@id='result_3']/div/div[2]/div/div/a/img")).click();
        d.findElement(By.xpath("//*[@id='add-to-wishlist-button-submit']")).click();
	}
}

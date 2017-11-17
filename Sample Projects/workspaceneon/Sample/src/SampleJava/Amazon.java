package SampleJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\sw\\softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//div[@class='nav-right']/div/a"))).pause(2000)
				.moveToElement(driver.findElement(By.xpath("//div[@id='nav-flyout-anchor']/div[6]/div/div/a"))).click().build()
				.perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//form[@id='ap_register_form']/div/div/div/input")).sendKeys("anusha");
		driver.findElement(By.xpath("//form[@id='ap_register_form']/div/div/div[2]/div/div/div/div[2]/input"))
				.sendKeys("7386977258");
		driver.findElement(By.name("secondaryLoginClaim")).sendKeys("valpadasanusha@gmail.com");
		driver.findElement(By.xpath("//form[@id='ap_register_form']/div/div/div[4]/div/input")).sendKeys("venuanu123");
		driver.findElement(By.xpath("//span[@class='a-button-inner']/input")).click();
		WebElement findElement = driver.findElement(By.xpath("//div[@id='auth-error-message-box']/div"));
		String text = findElement.getText();
		System.out.println(text);
		String expected = "Please use another Email address.";
		if (text.contains(expected)) {
			driver.findElement(By.xpath("//form[@id='ap_register_form']/div/div/div[8]/a")).click();
			// click on forgot password
			driver.findElement(By.xpath("//div[@id='a-page']/div/div[3]/div/div/form/div/div/div/div[2]/div/div[2]/a"))
					.click();
			driver.findElement(By.xpath("//div[@class='a-section a-spacing-large']/input")).sendKeys("7386977258");
			driver.findElement(By.xpath("//span[@id='a-autoid-0']/span/input")).click();

			// if email/phone number error occcured.

			String text2 = driver.findElement(By.xpath("//div[@class='a-box-inner a-alert-container']/div/ul/li/span")).getText();
			System.out.println(text2);
			String expected1 = "There was a problem We're sorry. We weren't able to identify you given the information provided.";

			if (text2.equals(expected1)) {
				System.out.println("aafsd");
				WebElement findelement2 = driver
						.findElement(By.xpath("//div[@class='a-section a-spacing-large']/input"));
				findelement2.click();
				findelement2.clear();
				findelement2.sendKeys("valpadasanusha@gmail.com");
				driver.findElement(By.xpath("//span[@id='a-autoid-0']/span/input")).click();// click on continue button
				
																							 
				driver.findElement(By.xpath("//div[@class='a-row']/div/label/input")).click();
				driver.findElement(By.xpath("//span[@id='a-autoid-0']/span/input")).click();

			}
		}
		// write for checking error messages
		for (String string : args) {
			
		}

	}

}

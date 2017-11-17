package SampleJava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Prog1 {
	static WebDriver d;
	public static void main(String[] args) throws InterruptedException{
     //System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\workspace\\softwares\\geckodriver.exe");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\workspace\\softwares\\chromedriver.exe");

      d = new ChromeDriver();
      d.manage().window().maximize();
      d.get("http://www.gmail.com");
      d.findElement(By.id("identifierId")).sendKeys("valpadasanusha@gmail.com");
      d.findElement(By.xpath("//div[@id='identifierNext']/content/span")).click();
     Thread.sleep(2000);
      
    WebElement pass=  d.findElement(By.name("password"));
    pass.sendKeys("venuanu123");
    d.findElement(By.xpath("//div[@id='passwordNext']/content/span")).click();
    Thread.sleep(2000);
    d.findElement(By.xpath("//div[@id=':if']/div/div")).click();
      
    String parentWindowHandler = d.getWindowHandle(); // Store your parent window
    String subWindowHandler = null;

    Set<String> handles = d.getWindowHandles(); // get all window handles
    Iterator<String> iterator = handles.iterator();
    while (iterator.hasNext()){
        subWindowHandler = iterator.next();
    }
    d.switchTo().window(subWindowHandler); // switch to popup window

    //d.findElement(By.xpath("//div[@id='passwordNext']/content/span")).click();

   // Actions action = new Actions(d);
    //action.sendKeys(Keys.ESCAPE).build().perform();
       
    
    // Now you are in the popup window, perform necessary actions here

    d.switchTo().window(parentWindowHandler);
	 
	}
}

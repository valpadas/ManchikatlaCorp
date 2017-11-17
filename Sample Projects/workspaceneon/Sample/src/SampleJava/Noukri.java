package SampleJava;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Noukri {
  @Test
  public void testpopup() {
	  System.setProperty("webdriver.chrome.driver","D:\\sw\\softwares\\chromedriver.exe");
	  WebDriver driver;
	  driver=new ChromeDriver();
	  driver.get("https://www.naukri.com/");
	 String parent= driver.getWindowHandle();
	 Set<String> s1=driver.getWindowHandles();
	 String popexpect="Browse Recruiters by Locations, Companies, FA & Industries - Naukri.com";
	 for (String string : s1) {
		
		 if(!parent.equals(popexpect)){
			 driver.switchTo().window(string);	
			 System.out.println( driver.switchTo().window(string).getTitle());
			 driver.close();
		 }
		
	}
  }
}

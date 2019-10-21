package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DialogueAlertTest {
	WebDriver driver;
	
  @Test(priority = 1)
  public void alert() throws Exception {
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText()); 
		driver.switchTo().alert().accept();
		
	}
 
  @Test(priority = 0)
  public void alertmessage() {
	 
  }
  
  @BeforeTest
  public void browser() {
		System.setProperty("webdriver.chrome.driver","F:\\SELENIUM SOFTWARES 2019\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
	}

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

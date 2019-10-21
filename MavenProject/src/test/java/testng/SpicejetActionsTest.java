package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SpicejetActionsTest {
	
	WebDriver driver;
	
  @Test
  public void mousehovering() throws Exception {
	  System.setProperty("webdriver.chrome.driver","F:\\SELENIUM SOFTWARES 2019\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		/* mouse hovering implementation*/
	//	a.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		a.moveToElement(driver.findElement(By.partialLinkText("ADD"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Visa Services")).click();
		/*keyboard actions implementation*/
		a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(2000);
		a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
  }
}

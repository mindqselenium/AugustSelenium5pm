package testng;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class HeadlesschromeTest {
	WebDriver driver;
	
	public void screenshot(String str) throws IOException {
		DateFormat df=new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss"); // date and time format specification
		Date d=new Date();// it will collect the current system date
		String time=df.format(d);
		System.out.println(time);
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("F:\\August05PM_SRNagar\\Selenium_javaproject\\screenshots\\"+str+time+".png"));
	}
	
	
  @Test
  public void headless() throws Exception {
	  System.setProperty("webdriver.chrome.driver","F:\\SELENIUM SOFTWARES 2019\\drivers\\chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("headless");
	  options.addArguments("1024,768");
	  driver=new ChromeDriver(options);
	  driver.get("http://www.fb.com");
	  driver.manage().window().maximize();
	  
	  String str=driver.getCurrentUrl();
	  System.out.println(str);
	  
	//  System.out.println(driver.getCurrentUrl());
	  
	  System.out.println(driver.getTitle());
	  
	  screenshot("fbhomepage");
  }
}

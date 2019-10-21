package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;

public class Sample3Test {

	@Test(priority = 1)
	  public void amethod() {
		  System.out.println("this is amethod");
	  }
	
  
	@Test(priority = 0,enabled = false)
  public void f() {
	  System.out.println("this is selenium");
  }
  
	  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("welcome...");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("bye..");
  }

}

package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Sample2Test {
	
	@Test
	  public void amethod() {
		  System.out.println("this is method");
	  }
	
  @Test
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

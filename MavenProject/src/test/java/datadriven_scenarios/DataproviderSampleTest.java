package datadriven_scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataproviderSampleTest {
  @Test(dataProvider = "dp") /* here dp is a dataprovider name*/
  public void f(Integer n, String s) {
  }

  @DataProvider  /*dataprovider is an annotation which will help to supply 
  the test data */
  public Object[][] dp()  /* here dp is the dataprovider name method which must be same as dataprovider*/
  {
    return new Object[][] {  /* here two objects will be returned from this dp method*/
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}

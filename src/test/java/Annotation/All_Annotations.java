package Annotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class All_Annotations {
  @Test
  public void f() {
	  System.err.println("this is my first test case ");
  }
  
  @Test
  public void v() {
	  System.err.println("this is my second test case ");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.err.println("this is my before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.err.println("this is my after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.err.println("this is my before class");
  }

  @AfterClass
  public void afterClass() {
	  System.err.println("this i smy after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.err.println("this is my before test");
  }

  @AfterTest
  public void afterTest() {
	  System.err.println("this is my after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.err.println("this is my before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.err.println("this is my after suite");
  }

}

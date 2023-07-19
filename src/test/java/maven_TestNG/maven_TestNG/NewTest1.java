package maven_TestNG.maven_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest1 {
  @Test
  public void f() {
	  System.out.println("hello");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("hi");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("hi1");
  }

}

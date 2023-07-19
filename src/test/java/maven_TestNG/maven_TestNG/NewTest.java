package maven_TestNG.maven_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
  @Test
  public void f() {
	  System.out.println("This is my Test area 1" );
	  
  }
  
  
  @Test
  public void g() {
	  System.err.println("This is my Test area 2");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is my precondition area");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is my postcondition area");
  }
  
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("i need a valid application url");
  }
  
  @AfterMethod
  public void aftermethod() {
	  System.err.println("close the application url");
  }

}

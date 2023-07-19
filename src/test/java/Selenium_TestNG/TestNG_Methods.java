package Selenium_TestNG;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.JavascriptExecutor;

public class TestNG_Methods {
	WebDriver driver =null;
  @Test(enabled=true)
  public void Testcase1() throws Throwable {
	  driver.findElement(By.id("navbarDropdown")).click();
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/div/a[1]")).click();
	  String title=driver.getTitle();
	  System.out.println("current title of Testcase 1 page:"+title);
	  Assert.assertEquals(title, "About Selenium | Selenium");
	  Thread.sleep(3000);
  }
  
  @Test(dependsOnMethods="Testcase1")
  public void Testcase2() throws Throwable {
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
	  Thread.sleep(3000);
	
	  String title1=driver.getTitle();
	  System.out.println("current title of Testcase 2 page:"+title1);
	  Assert.assertEquals(title1, "Downloads | Selenium");
  }
  
  @BeforeClass
  public void beforeClass() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "D:\\New eclipse workspace\\maven_TestNG\\server\\chromedriver_win32 (3)\\chromedriver.exe");
	 driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.selenium.dev");
	  
	
	  Thread.sleep(3000);
  }

 
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}

package Selenium_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	//Hardassertion :-> if the test condition is failed then it will stop next execution of programme.
  @Test
  public void Testcase1 () {
  WebDriverManager.chromedriver().setup();
  WebDriver driver =new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.google.com");
  String currenttitle=driver.getTitle();
  Assert.assertEquals(currenttitle, "Google");
  driver.navigate().refresh();
  driver.close();
  
}
  @Test
  public void Testcase2() {
	  //softassertion :-> if the test condition is failed then also it will continue next execution.
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  String currenttitle=driver.getTitle();
	  SoftAssert softassertion =new SoftAssert();
	  softassertion.assertEquals(currenttitle, "foogle");
	  driver.navigate().refresh();
	  softassertion.assertAll();
	  driver.close();
  }
}
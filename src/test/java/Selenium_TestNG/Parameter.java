//package Selenium_TestNG;
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class Parameter {
//  
//	
//
//	
//	
//	
//	@BeforeClass (alwaysRun=true)
//	@Parameters("browser")
//  public void beforeclass(String browser) throws Throwable {
//	if(browser.equalsIgnoreCase("chrome")) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//	}
//	else if(browser.equalsIgnoreCase("firefox")){
//		WebDriverManager.firefoxdriver().setup();
//		
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//	}
//	else if(browser.equalsIgnoreCase("edge")) {
//      WebDriverManager.edgedriver().setup();
//		
//		WebDriver driver=new EdgeDriver();
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//	}
//		
//		
//  }
//	
//	
//	@AfterClass(alwaysRun=true)
//	  public void logout() {
//		
//			WebDriverManager driver;
//			driver.quit();
//			
//	  }
//	
//}

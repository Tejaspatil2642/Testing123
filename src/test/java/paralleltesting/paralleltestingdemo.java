package paralleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class paralleltestingdemo {
	WebDriver driver =null;
	@Test
	public void test1() throws InterruptedException {	
		System.out.println("Test1 Execution"+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	Thread.sleep(3000);
	driver.close();
	}
	
	@Test
	public void test2() throws InterruptedException {
		System.out.println("Test2 Execution"+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(3000);
		driver.close();
		
	}
}

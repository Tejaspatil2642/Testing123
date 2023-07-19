package Selenium_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class webdrivermanager {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		WebDriverManager.edgedriver().setup();
		//WebDriver driver=new ChromeDriver();
		 //WebDriver driver1=new FirefoxDriver();
		WebDriver driver2=new EdgeDriver();
		
		 
		  driver2.get("https://www.google.com");

	}

}

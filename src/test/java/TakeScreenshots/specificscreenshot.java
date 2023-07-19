package TakeScreenshots;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class specificscreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		

	driver.get("https://munetrix.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	//take screenshot of section/portion of the page
//	WebElement section=driver.findElement(By.xpath("//*[@id=\"features\"]/div[1]/div/div/div[2]/div/div[1]/div/div/div/img"));
//	File src=section.getScreenshotAs(OutputType.FILE);
//	File trg=new File(".\\screenshots\\featureproducts.png");
//	FileUtils.copyFile(src,trg);
//	driver.close();
	
	
	//take screenshot of section/portion of the page2
	
	WebElement section=driver.findElement(By.xpath("//*[@id=\"tatsu-header-wrap\"]/div[2]/div/div[1]/div/a/img[1]"));
	File src=section.getScreenshotAs(OutputType.FILE);
	File trg=new File(".\\screenshots\\logo.png");
	FileUtils.copyFile(src,trg);
	driver.close();
	

	}

}

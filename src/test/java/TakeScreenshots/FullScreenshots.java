package TakeScreenshots;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FullScreenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		

	driver.get("https://runday.ai/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	//Take full screenshots
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg=new File(".\\screenshots\\homepage.png");
	FileUtils.copyFile(src,trg);
	driver.close();
		

	}

}

package SeleniumConcepts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
	/*	WebDriver driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("C:\\Users\\Monika Raj\\Desktop\\Selenium\\newfile.png")); */
		


WebDriver wd = new ChromeDriver();
wd.manage().window().maximize();
wd.get("https://money.rediff.com/companies/most-traded?src=moneyhome_mosttraded_more");
wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

File f = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(f, new File("C:\\Users\\Monika Raj\\Desktop\\Selenium\\newfile.png")); 


	
	}

}

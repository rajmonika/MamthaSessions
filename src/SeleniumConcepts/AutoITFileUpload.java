package SeleniumConcepts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoITFileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser		
		
		driver.get("http://tinyupload.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Monika Raj\\Desktop\\Selenium\\AutoITFileUploadDemo.exe");
		Thread.sleep(3000);


	}

}

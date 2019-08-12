package SeleniumConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser		
		
		//driver.get("https://www.google.com");//enters the url in the browser opened
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div[1]/a")).click();
		
		String winID = driver.getWindowHandle();
        System.out.println(winID);

		//Set<String> windowIDS = driver.getWindowHandles();
		//System.out.println(windowIDS);
		
		//driver.switchTo().window(arg0);
		
		driver.quit();
	}

}

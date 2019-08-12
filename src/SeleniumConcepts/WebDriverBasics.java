package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser		
		
		driver.get("https://www.google.com");//enters the url in the browser opened
		
		
		//driver.quit(); //closes the entire browser
		//driver.close(); //closes only the current window
		
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.navigate().to("https://www.amazon.in");

		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();

	}

}

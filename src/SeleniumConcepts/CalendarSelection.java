package SeleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarSelection {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser	
		
/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\firefoxdriver.exe");
		
		WebDriver driver = new FirefoxDriver(); //launches the browser	*/
		
		driver.manage().window().maximize();
		
		driver.get("https://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='s2id_autogen3']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='s2id_autogen3']")).sendKeys("mari");
		Thread.sleep(2000);
			
		List<WebElement> hotels = driver.findElements(By.xpath("//ul[@class='select2-result-sub']/li"));
		
		for(int i=0; i<hotels.size(); i++)
		{
			WebElement element = hotels.get(i);
			String text = hotels.get(i).getText();
			//System.out.println(text);
			
			if(text.equals("Maribor, Slovenia"))
			{
				element.click();
				break;
			}
		}
		
		
		String mon = "November 2019";
		//String date = "21";
		
		driver.findElement(By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")).click();

		WebElement month = driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[2]")); // July 2019
		
		while(true)
		{
			if(month.getText().equals(mon))
				break;
			else {
				driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[3]")).click();
				Thread.sleep(1000);
			}
			
		}
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/tbody/tr[4]/td[5]")).click();
		
		//CHECK OUT
		
		String mon2 = "December 2019";
		String date2 = "5";
		
		//Current Month selection
		WebElement month2 = driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][2]/div[1]/table/thead/tr[1]/th[2]")); //November 2019
		
		while(true)
		{
			if(month2.getText().equals(mon2))
				break;
			else {
				//Month forward button
				driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][2]/div[1]/table/thead/tr[1]/th[3]")).click();
				Thread.sleep(1000);
			}
			
		}
		
		//Date selection - 5 dec 2019
		driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][2]/div[1]/table/tbody/tr[2]/td[contains(text(),'"+date2+"')]")).click();
		
		
		//Adult & Child Selection
		
		driver.findElement(By.xpath("//input[@id='travellersInput']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='adultInput']")).click();
		driver.findElement(By.xpath("//button[@id='adultPlusBtn']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='childPlusBtn']")).click();
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("//input[@id='adultInput']")).clear();
		Thread.sleep(2000);
 		driver.findElement(By.xpath("//input[@id='adultInput']")).sendKeys("4");
 		
 		driver.findElement(By.xpath("//input[@id='childInput']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='childInput']")).clear();
		Thread.sleep(2000);
 		driver.findElement(By.xpath("//input[@id='childInput']")).sendKeys("6");
 		Thread.sleep(2000); */
 		
 		//Click on submit button
 		driver.findElement(By.xpath("//form[@name='fCustomHotelSearch']//button[@type='submit']")).click();


	}

}

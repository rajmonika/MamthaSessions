package SeleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Check {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		
		driver.get("https://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String month = "November 2019";
		String date = "30";
		
			
			// navigate to site
			driver.get("http://www.phptravels.net/");
			
			// click on calendar
			driver.findElement(By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")).click();
			
			// get web element of month
			WebElement mon = driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[2]")); //july2019
			
			while(true){
				// if given month matches break the while loop
				if(mon.getText().equals(month)){
					break;
				}
				else{
					// if given month matches click on next
					driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[3]")).click();
					Thread.sleep(1000);
				}
			}
			
			// click on date 
			driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/tbody/tr/td[contains(text(),'"+date+"')]")).click();;
			
			
			
			
			
			driver.findElement(By.xpath("//div[@id='s2id_autogen3']/a/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='select2-drop']/div/input")).sendKeys("mari");
			
			//driver.findElement(By.xpath("//ul[@class='select2-result-sub']/li[1]")).click();
			List<WebElement> hotels = driver.findElements(By.xpath("//ul[@class='select2-result-sub']/li"));
			
			for(int i=0; i<hotels.size(); i++)
			{
				WebElement  element = hotels.get(i);
				String text = hotels.get(i).getText();
				
				if(text.equals("bor, Slovenia"))
				{
					element.click();
					break;
				}
			}
			
		}
	
		
				
	}



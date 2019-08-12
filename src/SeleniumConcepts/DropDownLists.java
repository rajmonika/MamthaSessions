package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownLists {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser		
		
		//driver.get("https://www.google.com");//enters the url in the browser opened
		
		driver.get("https://in.ebay.com/");
		
		driver.manage().window().maximize();
		
		//Syntax - Select dd = new Select(WebElement);
		//SelectbyIndex
		//selectByValue
		//SelectByVisibleText
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		
		Select sel = new Select(dropdown);
		
		WebElement firstoption = sel.getFirstSelectedOption();
		System.out.println("Default option is: "+firstoption.getText());
		//sel.selectByIndex(6);
		//sel.selectByValue("15032");
		sel.selectByVisibleText("eBay Motors");
		
		List<WebElement> option = sel.getOptions();
		
		for(WebElement ele : option)
		{
			System.out.println(ele.getText()); //all the values in the list
			/*if(ele.getText().equals("Stamps"))
			{
				System.out.println("Stamps Found");
			}
			else
			{
				System.out.println("Stamps not found");
			}*/
		}

	
	}

}

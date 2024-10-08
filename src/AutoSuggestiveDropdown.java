import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swati Manhotra\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		//based on ind it will show the results , if we want to select india from that index of india might vary depending on input provided
	// so first get all options selected from the list and then iterate through those options
		
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
	
		for(WebElement option:options)
		{
		if(option.getText().equalsIgnoreCase("India"))
		{
			option.click();
			break; // when we found india no need to iterate further
			
		}
		
		}
		
	}

}

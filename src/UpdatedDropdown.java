import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TestNG is one of the testing framework
//Assertions

public class UpdatedDropdown {

	//updated dropdown and checkboxes
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swati Manhotra\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//to select checkbox
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//using assertion for the above step
		//we want to get false here,test will pass if Assert.assertfalse(false) - false is required in bracket
		//if Assert.assertfalse(true)-test will fail
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//using assertion for above step - Assert.assertTrue(true)-test will pass
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//to count number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	
		//for passengers dropdown
		// for 2 adults , one adult will be selected by default and once we will click on + symbol
		/*
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		*/
		
		// for 5 adults, 1 adult automatically selected and 4 times we will click on + symbol
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		//while loop
		
		//initialize first, then compare and put condition to increment it
		
		/*
		int i=1; // because 1 adult is already selected
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); // 4 times click
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		*/
		
		//with for loop
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());// to see if 1 adult is showing before selection
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // to see if 5 adults is showing after selection
		
	}

}

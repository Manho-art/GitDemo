import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//departure city is dynamic dropdown because we can inspect a chennai city only when we click on dropdown
		//if we reload page and try to find chennai city element we cant find it

		//arrival city dropdown is also dynamic as it load only after we select a city in departure city dropdown
		
		
		//when we select bengaluru in departure and then try to find chennai in arrival it will show 2 matches found
		//as chennai is there in departure dropdown also
		//   so selenium scans from top to bootom and left to right , so it will select chennai in departure dropdown
		
		//   //a[@value='BLR']
		//  //a[@value='MAA']
		
		//to select chennai in arrival dropdown use below syntax
		// (//a[@value='MAA'])[2]
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swati Manhotra\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();  
		// we dont need to give index of dropdown here 
		//as selenium scans from left to right so it will select from first dropdown only
		
		Thread.sleep(2000);
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click(); - no need of this line
		// as 2nd dropdown is automatically opening when we select city in first dropdown
		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		//if we dont want to use index
		//Parent child relationship locator to identify objects uniquely
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		

	}

}

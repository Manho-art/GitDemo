import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swati Manhotra\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com"); // this statement will wait until full page is loaded with all components
		
		driver.navigate().to("https://rahulshettyacademy.com/"); // it will not wait for full page laoding,it will continue once the basic elements of the page is loaded
	// if we have to wait for the age to get loaded , we need to use implicit wait. or sleep or explicit wait
		
		//navigate is used when u want to navigate to another screen when u r already in automation
		
		
		driver.navigate().back(); // to prev page
	//	driver.navigate().forward(); // again to rahul shetty screen
		
		
	}

}

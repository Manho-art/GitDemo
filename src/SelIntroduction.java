import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking browser
		//Chrome - ChromeDriver class - Contain Methods to automate in chrome browser
		//create obj of class to access methods
		//Chrome - ChromeDriver class - Contain Methods - close get
		//Firefox - FirefoxDriver - methods - close get
		//Safari - SafariDriver - methods - close get
		 //same methods in all browsers, implementation is different
		//webdriver - interface that provides set of browser automation methods with empty bodies
		
		//chrome driver can implement webdriver methods + own class methods
		//below driver obj can access class methods as well as webdriver methods
		// but if same code is run in firefox, that wont have same class methods
		// hence we need an obj that can access only webdriver methods
		
		//ChromeDriver driver= new ChromeDriver();
		//ChromeDriver.exe (third party driver file)-> from this exe file actions will got to chrome browser
		//selenium doing all work using this file
		//webdriver.chrome.driver -> value of path
		
		
		//chrome browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swati Manhotra\\Documents\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		//firefox launch
		//Gecko driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Swati Manhotra\\Documents\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		//Microsoft edge driver
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Swati Manhotra\\Documents\\msedgedriver.exe");
		//WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.udemy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); // closes only current window - for 1 window script
		driver.quit(); //quits driver, closing all associated windows- for multiple windows script
		
		
	
	}

}

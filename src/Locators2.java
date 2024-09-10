import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="rahul";
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swati Manhotra\\Documents\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Swati Manhotra\\Documents\\msedgedriver.exe");
				//WebDriver driver= new EdgeDriver();
				
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Swati Manhotra\\Documents\\geckodriver.exe");
				WebDriver driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //smthing doesnt exist on page and waiting for objects to show on page
		
		String password =getPassword(driver); // calling static method to get password value from reset pwd page
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		//hard coded pwd value
		//driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy"); 
		
		//when using getPassword method to get password from reset login page
		driver.findElement(By.name("inputPassword")).sendKeys(password);
				
		driver.findElement(By.className("signInBtn")).click();
		System.out.println("X changes 3");
		System.out.println("X changes 4");
		//it might take 1 sec to load the page
		Thread.sleep(1000);
		
		//login page has 2 p tags, if wait is not there then it take p tag of login page only instead of next page p tag
		// so we need thread.sleep
		
		// prev timeouts wait was helpful when element tag is not there on the page and it takes time to load the element
		
		//if only one tag with p in the whole page
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		//Assertion
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in."); // pass
		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are logged in."); --fail
		
		//to check if same user name shows after sign as Hello Rahul,
		//Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello rahul,");
		
		// or
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		
		// to identify element based on text
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		//driver.close();
		
				
				//or //*[text()='Log Out'] 
		
	}
	
	//creating a method to take password text from reset login page and use that to enter password in login page
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String pwd=driver.findElement(By.cssSelector("form p")).getText();
		String[] pwdArray=pwd.split("'");
		//pwdArray[0]=Please use temporary password
		//pwdArray[1]=rahulshettyacademy' to Login.
		
		String password=pwdArray[1].split("'")[0];
		return password;
		// or String[] pwdArray1=pwdArray[1].split("'");
		//pwdArray1[0]
		};
	

}

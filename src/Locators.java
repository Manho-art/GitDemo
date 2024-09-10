import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
	//Locators:
		
		
		/*
		 ID,XPATH,CSS SELECTOR,NAME,CLASS NAME,TAG NAME,LICK TEXT, PARTIAL LINK TEXT
		 
		 Xpath , css selector ->> we need to construct from html code
		 remaining all have one on one mapping
		 
		 <input type="text" placeholder="Username" id="inputUsername" value="">
		 
		input- tagname
		type,placeholder,id,value - attribute
		"text","username","inputusername" - attribute values
		
		*/
		
		
		//implicit wait - 5 seconds(its applicable for all lines where its not showing up, it will wait for 5 seconds to show up)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swati Manhotra\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //waiting for objects to show on page
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("abc");
		
		// <button class="submit signInBtn" type="submit">Sign In</button>
		// class has 2 values as the values are separated by space, so we can use any one value
		driver.findElement(By.className("signInBtn")).click();
		System.out.println("git clone");
		
		//CSS selector
		//if we have <input type="text" placeholder="Username" id="inputUsername" value="">
		//<button class="submit signInBtn" type="submit">Sign In</button>
		
		//classname -> tagname.classname -> button.signInBtn
		//id->tagname#id -> input#inputUsrname
		

		//<input type="text" placeholder="Username"  value="">
		//if no classname,id or name, then we need to build css selector using below syntax
		
		//Tagname[attribute='value']
		//input[placeholder='Username']
		
		// for error on wrong sign in
		//<p class="error">* Incorrect username or password </p>
		//CSS selector- >p.error
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//this fails due to timeout as chrome takes some time to show  error message but selenium is searching for error text before that
		//so we will use implicit wait-lets say 5 sec we put
		//as soon as it found the error message say at 2 sec, it will stop the wait time n execute get text, it will not wait for 5 seconds to get complete
		
		// we can check uniqueness of css selector using selector hub(p.error) or console($('p.error')
		
		//forgot passsword link - if it has <a> anchor tag it means its a link
		//<a href="#" xpath="1">Forgot your password?</a>
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//we need to add wait when view is changing from one to other
		Thread.sleep(1000); //we are already on page but its in changing state so not clickable so we need to wait to get into stable state
		
		//Xpath - generic locator- can be constructed using any html element
		// syntax - //Tagname[@attribute='value']
		
		//<input type="text" placeholder="Name" xpath="1">
		
		//uniqueness of xpath can be checked using selectors hub putting xpath there or in console putting $x('//Tagname[@attribute="value"]')
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		
		//finding email id field with some other locator
		// if type='text' is coming at multiple places , then we can use index with xpath //Tagname[@attribute='value'][index]
		
		// for css selector, syntax to find is Tagname[attribute='value']:nth-child(2)
		
		//parent to child xpath -  when element has no attribute , we can use xpath from parent to child using tagname
		//syntax - //parentTagname/childTagname
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9988845678");
		//tagname.classname -> tagname is needed only when multiple classes has same name and varied by tagname
		//otherwise we can use just .classname
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//org.openqa.selenium.ElementClickInterceptedException 
		//we got this error when app is in changing state from one view to another , so we need to add wait
		//parent to child css selector  - syntax -parentTagname childTagname
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//go to login page again
		driver.findElement(By.xpath("//div/button[1]")).click();
		//or driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		Thread.sleep(1000);// as view is changing back to login page
		
		//id - tagname#id (css )
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Rahul");
		
		//using regular expressions with css-last 4 letters of type=password changes everytime- dynamic
		//<input type="password" placeholder="Password" name="inputPassword" value="" xpath="1">
		//Css - input[type='password']
		//reg exp css- input[type*='pass']
		
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		
		//reg exp with xpath - signInBtn is dynamic -submit is statics
		//xpath - //button[@class="submit signInBtn"]
		//reg exp xpath - //button[contains(@class,'submit')]
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swati Manhotra\\Documents\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				//Sibling - child - parent traverse
				
				//absolute xpath = start with / - start from begining of html
				//relative xpath =  start with // - start in middle
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				// to find Practice link using parent to child traverse
				driver.findElement(By.xpath("//header/div/button[1]")).click();
				
				//Sibling to Sibling  - to find sibling of Practice (login)
				//System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
				
				//Child to parent Traverse  - not possible in css , only possible in xpath
				
				//frm practice to div
				//header/div/button[1]/parent::div
				
				//from practice to div to header
				//header/div/button[1]/parent::div/parent::header
				
				// from header to anchor tag - parent to child
				//header/div/button[1]/parent::div/parent::header/a
	
				// from practice to div to login
				//header/div/button[1]/parent::div/button[2]
				
				//another way of going to login
				System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
				
				
				System.out.println("Architect1 app1");
				System.out.println("Architect1 app2");
				System.out.println("Architect1 app3");
				
	}

}

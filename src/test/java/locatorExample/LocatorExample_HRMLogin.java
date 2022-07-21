package locatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorExample_HRMLogin {
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//maximize browser
		driver.manage().window().maximize();
		
	}

	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(4000);
		driver.close();		
	}
	
	@Test
	public void login() throws Exception {
		
		//locators
		//id 
		
		//ID locator
		WebElement txt_userName = driver.findElement(By.id("txtUsername"));
		txt_userName.sendKeys("Admin");
		
		
		//Name - password
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//ClassName
		//driver.findElement(By.className("button")).click();
		
		
		//Tagname
		//driver.findElement(By.tagName("button")).click();


		//linkText
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		
		//partiallinkText
		//driver.findElement(By.partialLinkText(" your password?")).click();
		
		//partiallinkText
		driver.findElement(By.partialLinkText(" your pass")).click();
		Thread.sleep(2000);
		
		//XPATH
		driver.findElement(By.xpath("//*[@value='Cancel']")).click();
		
		Thread.sleep(2000);
		
		//partiallinkText
		driver.findElement(By.partialLinkText(" your pass")).click();
		Thread.sleep(2000);
		
		//CSS Selector
		driver.findElement(By.cssSelector("[value='Cancel']")).click();
		
		
	}
	
}

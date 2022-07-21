package recordingTest;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestExample {

	// Unit testing framework - Junit/TestNG

	@Test
	public void test1() throws Exception {

		// System.out.println("hello everyone, happy learning !!");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Act\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		{
			List<WebElement> elements = driver.findElements(By.cssSelector("h1"));
			assert (elements.size() > 0);
		}
		driver.findElement(By.id("welcome")).click();
		
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		driver.close();

	}

}

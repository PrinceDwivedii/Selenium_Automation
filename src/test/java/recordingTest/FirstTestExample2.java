package recordingTest;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTestExample2 {

	// Unit testing framework - Junit/TestNG

	@Test
	public void test1() throws Exception {

		// System.out.println("hello everyone, happy learning !!");
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Act\\Downloads\\chromedriver_win32\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
		
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Act\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		

	}

}

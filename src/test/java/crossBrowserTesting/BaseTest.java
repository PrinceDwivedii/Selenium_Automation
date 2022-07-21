package crossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	
	
	
	
	@Parameters("coforge_browser")
	@BeforeTest
	public void launchApp(String browser) {
	
		
		//String browser = "chrome";
		
		System.out.println("Running test case on browser: " + browser);
		
		if(browser.equalsIgnoreCase("CHROME")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge")){
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else {
			
			System.out.println("please check browser, running on edge browser default");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		
		
		
		
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//maximize browser
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(4000);
		driver.close();		
	}


}

package attendanceSheet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	@BeforeTest
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://paytm.com/");
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSd32CTclabKVm44rKIUBGzYlngLduGMMbYgbTGCNQZAUih9mw/viewform");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	

	@AfterTest
	public void closeApp() throws Exception {

		Thread.sleep(4000);
		//driver.close();
		driver.quit();
		
	}

}

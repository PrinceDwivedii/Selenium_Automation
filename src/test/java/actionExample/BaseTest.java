package actionExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	Actions act ;

	@BeforeTest
	public void launchApp() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		//driver.get("https://jqueryui.com/droppable/");
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		act = new Actions(driver);
		
	}
	
	

	@AfterTest
	public void closeApp() throws Exception {

		Thread.sleep(4000);
		driver.close();
	}

}

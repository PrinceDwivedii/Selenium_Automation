package hrmAppExample_log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigRead;

public class BaseTest {

	WebDriver driver;
	ConfigRead conf;
	Logger log;
	@BeforeTest
	public void launchApp() throws Exception {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//Create an object
		conf = new ConfigRead();
		log = Logger.getLogger("Coforge_HRM_Login_Logout");
		PropertyConfigurator.configure(".\\configFolder\\log4j.properties");
		
		
		log.info("============launchApp===================");
		log.info("Application launched successfully on chrome browser, app URL: " + conf.getApplication_QA_URL());
		driver.get(conf.getApplication_QA_URL());
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		//maximize browser
		driver.manage().window().maximize();
		
		
		
		
		
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		
		log.info("closing browser");
		Thread.sleep(4000);
		driver.close();		
	}


}

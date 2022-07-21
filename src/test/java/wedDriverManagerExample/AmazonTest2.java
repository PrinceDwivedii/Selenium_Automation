package wedDriverManagerExample;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest2 {

	
	@Test
	public void searchTest() {
	
		//DriverPath
		//Browser update: 110
		//Driver : 103 
		//update manually
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\Act\\Downloads\\edgedriver_win64_100\\msedgedriver.exe");  //Driver version : 103
		
		//Auto download driver - configure
//		WebDriverManager.edgedriver().setup();)
		
//		WebDriverManager.edgedriver().setup();
//		
//		WebDriver driver = new EdgeDriver();
		
		
		WebDriverManager.firefoxdriver().setup();
		
		//WebDriverManager.chromiumdriver().all();
		
		WebDriver driver = new FirefoxDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
	}
	
	
}

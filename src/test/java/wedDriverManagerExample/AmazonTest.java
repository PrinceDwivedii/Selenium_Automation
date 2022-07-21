package wedDriverManagerExample;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonTest {

	
	@Test
	public void searchTest() {
	
		//DriverPath
		//Browser update: 110
		//Driver : 103 
		//update manually
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Act\\Downloads\\edgedriver_win64_100\\msedgedriver.exe");  //Driver version : 103
		WebDriver driver = new EdgeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
	}
	
	
}

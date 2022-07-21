package recordingTest;

import java.util.List;

import org.junit.Test;

//import org.junit.jupiter.api.Test;

//import org.junit.Test;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JUnitErrorExample {

	// Unit testing framework - Junit/TestNG

	//ctrl+SHoift+O - add/remove imports
	
	@Test
	public void test1() throws Exception {

		System.setProperty("webdriver.edge.driver",".\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		

	}

}

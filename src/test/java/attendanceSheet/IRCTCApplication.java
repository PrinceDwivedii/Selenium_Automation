package attendanceSheet;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IRCTCApplication  extends BaseTest{

	

	@Test
	public void verifySign() throws Exception {
		
		
		
		String parentWindow = driver.getWindowHandle();					//single window  ---- findElement
		System.out.println("Window info: " + parentWindow);
		
		//handle modal
		WebElement fName = driver.findElement(By.xpath("//span[text()='FirstName']//ancestor::div[@jsmodel=\"CP1oW\"]//descendant::input"));
		fName.sendKeys("firstName ...");
		
		WebElement date = driver.findElement(By.xpath("//span[text()='Date']//ancestor::div[@jsmodel=\"CP1oW\"]//descendant::input"));
		date.sendKeys("16-07-2022");
				
				
	}
	
	
	
}

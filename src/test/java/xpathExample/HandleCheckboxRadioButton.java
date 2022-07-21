package xpathExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleCheckboxRadioButton extends BaseTest {

	
	
	@Test(priority = 1)
	public void checkBoxTest() {
		driver.findElement(By.xpath("//td[text()='Helen Bennett']//preceding-sibling::td//child::input")).click();
		
	}
	
	
	
}

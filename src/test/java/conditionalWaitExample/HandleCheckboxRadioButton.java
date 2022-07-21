package conditionalWaitExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleCheckboxRadioButton extends BaseTest {

	
	
	@Test(priority = 1)
	public void checkBoxTest() {
		driver.findElement(By.cssSelector("#check2")).click();
		
	}
	
	
	@Test(priority = 2)
	public void radioButtonTest() {
		
		driver.findElement(By.cssSelector("input[value*='fema']")).click();
	}
	
}

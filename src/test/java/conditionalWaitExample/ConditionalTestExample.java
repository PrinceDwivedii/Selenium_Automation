package conditionalWaitExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ConditionalTestExample extends BaseTest{

	
	
	@Test
	public void test1() {
		
		
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='text3']")));
//		
		
		WebElement input_txt_3 = driver.findElement(By.cssSelector("input[id='text3']"));
		input_txt_3.sendKeys("enter some value...");
		
		
		
		
		
		
		
	}
	
}

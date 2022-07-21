package xpathExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class RutoUtilityExample extends BaseTest{

	
	@Test
	public void searchItems() {
		
		
		
		//input#twotabsearchtextbox
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("iphone"+Keys.ENTER);
		
		
		
		//driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		
		
	}
	
	
}

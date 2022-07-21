package xpathExample;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonExample extends BaseTest {

	
	
	@Test(priority = 1)
	public void checkBoxTest() throws Exception {
		
		//Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Cookware & di')]//parent::div//following-sibling::div[contains(@class,'foo')]//child::a[text()='See more']")));
		
		//driver.findElement(By.xpath("//h2[contains(text(),'Cookware & di')]//parent::div//following-sibling::div[contains(@class,'foo')]//child::a[text()='See more']")).click();
		
		driver.findElement(By.xpath("//h2[contains(text(),'Cookware & di')]//ancestor::div[@data-a-card-type=\"basic\"]//descendant::a[text()='See more']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Kitchen"));
		
		
	}
	
	
	
}

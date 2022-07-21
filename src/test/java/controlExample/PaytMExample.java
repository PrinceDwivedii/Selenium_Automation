package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaytMExample  extends BaseTest{

	

	@Test
	public void verifySign() throws Exception {
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		
		
		//Thread.sleep(4000);
		
		
		//Alert/Frame/windows ------ driver.switchTo()
		
		//Element are inside frame
		//get Text: To Login into your Paytm Web account
		//click on Watch Video
		
		//driver.switchTo().frame(0);   //index ---- start from 0
		
		//driver.switchTo().frame("ID/name");
		
		
		WebElement myFrame = driver.findElement(By.xpath("//iframe[contains(@src,'login?isIframe')]"));
		driver.switchTo().frame(myFrame);
		
		
		
		String headingText = driver.findElement(By.cssSelector(".heading")).getText();
		System.out.println(headingText);
		Assert.assertTrue(headingText.contains("your Paytm Web"));
		driver.findElement(By.xpath("//span[contains(text(),'Watch Video')]")).click();
		
		
		
		
	}
	
	
	
}

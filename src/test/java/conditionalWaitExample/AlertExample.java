package conditionalWaitExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class AlertExample extends BaseTest{
	
	
	//@Test
	public void SimpleAlert() throws Exception {
		
		//generating an alert
		
		driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
		
		Thread.sleep(4000);
		//Handle Alert
		
		//Alert - accept/dismiss ----- click on OK and Cancel button
		//Alert - text : validate
		//Alert - editbox: enter value
		
		//Alert/Window/Frame ------ driver.switchTo().alert
		
		
		Alert simple_alert = driver.switchTo().alert();
		
		System.out.println("Alert Text: " + simple_alert.getText());
		
		Assert.assertEquals(simple_alert.getText(), "Hi.. This is alert message!");
		Assert.assertTrue(simple_alert.getText().contains("alert message!"));
		
		//simple_alert.accept();
		simple_alert.dismiss();
		
	}
	
	
	//@Test
	public void ConfirmAlert() throws Exception {
		
		//generating an alert
		
		driver.findElement(By.xpath("//button[contains(text(),'Confirmation')]")).click();
		
		Thread.sleep(4000);
		Alert confirmAlert = driver.switchTo().alert();
		
		System.out.println("Alert Text: " + confirmAlert.getText());
		
		Assert.assertEquals(confirmAlert.getText(), "Press 'OK' or 'Cancel' button!");
		Assert.assertTrue(confirmAlert.getText().contains("'OK' or 'Cancel'"));
		
		
//		confirmAlert.accept();
//		String verifyActionText = driver.findElement(By.cssSelector("#demo")).getText();
//		Assert.assertTrue(verifyActionText.contains("OK"));
		
		
		confirmAlert.dismiss();
		String verifyActionText = driver.findElement(By.cssSelector("#demo")).getText();
		Assert.assertTrue(verifyActionText.contains("Cancel"));
		

		
	}
	
	
	@Test
	public void PromptAlert() throws Exception {
		
		//generating an alert
		String name = "Abhishek";
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		
		Thread.sleep(4000);
		Alert confirmAlert = driver.switchTo().alert();
		
		System.out.println("Alert Text: " + confirmAlert.getText());
		
		Assert.assertEquals(confirmAlert.getText(), "Your Name Please");
		Assert.assertTrue(confirmAlert.getText().contains("Name Please"));
		
		
		confirmAlert.sendKeys(name);
		confirmAlert.accept();
		
	}

}

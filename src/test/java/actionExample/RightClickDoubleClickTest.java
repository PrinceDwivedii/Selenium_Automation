package actionExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RightClickDoubleClickTest extends BaseTest{



	@Test
	public void RightClickTest() throws Exception {
		
		WebElement rightButton = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		

		//context click
		act.contextClick(rightButton).perform();
		
		WebElement deleteButton = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
		deleteButton.click();
		
		
		Alert deleteAlert = driver.switchTo().alert();
		System.out.println(deleteAlert.getText());
		Assert.assertTrue(deleteAlert.getText().contains("delete"));
		Thread.sleep(4000);
		deleteAlert.accept();
		
	}

	
	
	@Test
	public void DoubleClickTest() throws Exception {
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		

		//context click
		act.doubleClick(doubleClickButton).perform();
		
		
		Alert doubleClickAlert = driver.switchTo().alert();
		System.out.println(doubleClickAlert.getText());
		Assert.assertTrue(doubleClickAlert.getText().contains("double clicked me.. "));
		Thread.sleep(4000);
		doubleClickAlert.accept();
		
	}

}

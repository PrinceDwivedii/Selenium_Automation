package recap;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ModalExample extends BaseTest{

	
	@Test
	public void modalTest() throws Exception {
		
		
		
		WebElement btn_Modal = driver.findElement(By.xpath("//*[contains(text(),'nch mo')]"));
		
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].click();", btn_Modal);
		
		
		Thread.sleep(2000);
		//Take screenshot
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		
		File target = new File("./screenshot/modalTest1.png");
		
		FileUtils.copyFile(source, target);
		
	}
	
}

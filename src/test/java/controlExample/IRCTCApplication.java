package controlExample;

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
		driver.findElement(By.xpath("//button[contains(text(),'K')]")).click();
		
		Thread.sleep(2000);
		WebElement btnHotel = driver.findElement(By.xpath("//a[contains(text(),'HOTELS')]"));
		btnHotel.click();
		
		
		
		//mutiple window ---- mainWindow and HotelWindow
		
		Set<String> multipleWindows = driver.getWindowHandles();
		
		String mainWindow = (String) multipleWindows.toArray()[0];
		String hotelWindow = (String) multipleWindows.toArray()[1];
		
		System.out.println("MainWindow" + mainWindow);
		System.out.println("Hotel Window" + hotelWindow);
		
		System.out.println("Hotel windows opened.............");
		Thread.sleep(4000);
		
		
		
		
		//Hotel window
		
		driver.switchTo().window(hotelWindow);
		
		Thread.sleep(5000);
		WebElement btnLogin = driver.findElement(By.xpath("//a[@data-target=\"#LoginFormPopup\"]"));
		btnLogin.click();
		Thread.sleep(4000);
		
		//Switch back to main WIndow
		driver.switchTo().window(mainWindow);
		Thread.sleep(4000);
		WebElement btnContactUS = driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]"));
		btnContactUS.click();
		
		
		//Hotel window
		Thread.sleep(5000);
				driver.switchTo().window(hotelWindow);
				WebElement btnLoginModal = driver.findElement(By.xpath("//label[text()='Password']//parent::div//following-sibling::div/button[text()='Login']"));
				btnLoginModal.click();
				Thread.sleep(5000);
		
				
				
	}
	
	
	
}

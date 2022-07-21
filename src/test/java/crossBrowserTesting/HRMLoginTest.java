package crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HRMLoginTest extends BaseTest{

	
	@Test(priority = 1, description = "verify with valid user details")
	public void login() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.className("button")).click();
		
		//validation
		
		Boolean verifyDashbaord = driver.findElement(By.tagName("h1")).isDisplayed();
		System.out.println("is dashboard present on page: " + verifyDashbaord);
		Assert.assertTrue(verifyDashbaord);
	}
	
	@Test(priority = 2)
	public void logout() {
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Logo")));
		
		driver.findElement(By.partialLinkText("Logo")).click();
		
		
		//validation step
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	}
	
}

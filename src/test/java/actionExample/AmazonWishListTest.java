package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonWishListTest extends BaseTest {

	
	@Test
	public void verifyWishList() throws Exception {
		
		
		WebElement btn_SignIn = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign')]"));
		WebElement lnk_WishList = driver.findElement(By.xpath("//span[contains(text(),'Create a Wish List')]"));
		
		//moveToElement
		act.moveToElement(btn_SignIn).click(lnk_WishList).perform();
		
		Thread.sleep(4000);
		//Validation step
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains("wishlist"));
		Assert.assertTrue(driver.getTitle().contains("Wish List"));
		
	}
	
	
}

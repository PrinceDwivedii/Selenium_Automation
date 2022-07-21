package recap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HRMLoginTest extends BaseTest{

	
	@Test
	public void verifyCancelFeature() throws Exception {
		
		
		driver.findElement(By.partialLinkText("Forgot your passw")).click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.name("button")).click();   //two element---- by default it can perform action on first element
		
		//multiple matches
		
		List<WebElement> eles = driver.findElements(By.name("button"));
		System.out.println(eles.get(1).getAttribute("value"));
		System.out.println(eles.get(1).getAttribute("id"));
		System.out.println(eles.get(1).getAttribute("class"));
		System.out.println(eles.get(0).getAttribute("value"));
		
//		for(int i; i < eles.size(); i++) {
//			
//			eles.get(i).getAttribute("value");
//		}
		
		
	}
	
	
}

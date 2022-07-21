package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragDropTestExample extends BaseTest{



	@Test
	public void dragdropTest1() {
		
		WebElement trashFrame = driver.findElement(By.xpath("//iframe[contains(@data-src,'photo-manager')]"));
		driver.switchTo().frame(trashFrame);
		
		
				
		WebElement img3 = driver.findElement(By.xpath("//img[contains(@src,'tatras3')]"));
		WebElement img4 = driver.findElement(By.xpath("//img[contains(@src,'tatras4')]"));
		WebElement trash = driver.findElement(By.cssSelector("div#trash"));

		
		//drag and drop
		
		act.dragAndDrop(img3, trash).perform();
		act.dragAndDrop(img4, trash).perform();
		
		
		
	}


}

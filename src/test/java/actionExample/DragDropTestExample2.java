package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragDropTestExample2 extends BaseTest{



	@Test
	public void dragdropTest1() throws Exception {
		
		WebElement trashFrame = driver.findElement(By.xpath("//iframe[contains(@src,'droppable')]"));
		driver.switchTo().frame(trashFrame);
		
		
				
		WebElement img3 = driver.findElement(By.cssSelector("div#draggable"));
		
		WebElement trash = driver.findElement(By.cssSelector("div#droppable"));

		
		//drag and drop
		//Method1 
		//act.dragAndDrop(img3, trash).perform();
		//act.dragAndDrop(img4, trash).perform();
		
		
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.
		
		
		//Method2
		//act.clickAndHold(img3).moveToElement(trash).release().perform();
		
		
		//Method3
		act.clickAndHold(img3).perform();
		Thread.sleep(1000);
		act.moveToElement(trash).perform();
		Thread.sleep(1000);
		act.release().perform();
		
	}


}

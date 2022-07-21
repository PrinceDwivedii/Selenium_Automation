package conditionalWaitExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleListExample extends BaseTest{

	
	@Test(enabled = false)
	public void list1() throws Exception {
		
		
		WebElement list = driver.findElement(By.name("FromLB"));
		
		
		
		
		Select anyThing = new Select(list);
		
		
		System.out.println("Is listbox accept multiple selection or not: " + anyThing.isMultiple());
		
		
		
		anyThing.selectByIndex(0);						//USA
		Thread.sleep(1000);
		anyThing.selectByValue("India");				//India
		Thread.sleep(1000);
		anyThing.selectByVisibleText("Germany");		//Germany
		
		Thread.sleep(1000);
		//deSelection
		anyThing.deselectByIndex(6);						//Germany
		Thread.sleep(1000);
		anyThing.deselectByVisibleText("USA");
		
	}
	
	
	@Test(enabled = false)
	public void list2() throws Exception {
		
		
		WebElement list = driver.findElement(By.cssSelector("#Carlist"));
		Select ele_list = new Select(list);
		
		
		System.out.println("Is listbox accept multiple selection or not: " + ele_list.isMultiple());
		
		Assert.assertFalse(ele_list.isMultiple());
		
		ele_list.selectByIndex(1);							//BMW
		Thread.sleep(1000);
		ele_list.selectByValue("Volvo Car");				//Volvo
		Thread.sleep(1000);
		ele_list.selectByVisibleText("Audi");				//Audi
		
		Thread.sleep(1000);
		
		
	}
	
	@Test
	public void listTest() {
		
		driver.findElement(By.cssSelector("#car3")).click();
		
		
	}
	
}

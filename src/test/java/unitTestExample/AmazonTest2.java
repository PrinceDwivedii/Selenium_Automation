package unitTestExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest2 {

	WebDriver driver;

	// Unit testing ------ pre-condition -------Before-----

	@Before
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// driver.

	}

	@After
	public void closeApp() {

		driver.close();
	}

	@Test     		//----- no of test case
	public void login() throws Exception {

		// Locator - used to identify element :
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");

		Thread.sleep(4000);

		WebElement txt_Searchbox = driver.findElement(By.id("twotabsearchtextbox"));

		// action

		txt_Searchbox.clear();
		Thread.sleep(4000);
		txt_Searchbox.sendKeys("iphone 15");
		System.out.println("Area- label attribute value are: " + txt_Searchbox.getAttribute("aria-label"));
		Thread.sleep(4000);
	}

}

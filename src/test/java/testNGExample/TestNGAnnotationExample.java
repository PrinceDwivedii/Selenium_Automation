package testNGExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationExample {

	
	
	@BeforeClass
	//@BeforeSuite ---->BeforeTest ----->BeforeClass ----->BeforeMethod
	
	//Test --
	
	//AfterMethod ---->AfterClass----->AfterTest----->AfterSuite
	
	@BeforeSuite
	public void setupSuite() {
		System.out.println("============@@BeforeSuite============");
		
	}
	
	@AfterSuite
	public void teardownSuite() {
		System.out.println("==============@AfterSuite============");
		
	}
	
	@BeforeTest
	public void setupTest() {
		System.out.println("@BeforeTest-----------");
		
	}
	
	@AfterTest
	public void teardown() {
		System.out.println("@AfterTest---------");
		
	}
	
	
	@BeforeClass
	public void setupClass() {
		System.out.println("@BeforeClass-----------");
		
	}
	
	@AfterClass
	public void teardownClass() {
		System.out.println("@AfterClass-----------");
		
	}
	
	@BeforeMethod
	public void setupMethod() {
		System.out.println("**********@BeforeMethod***********");
		
	}
	
	@AfterMethod
	public void teardownMethod() {
		System.out.println("###########@AfterMethod############");
		
	}
	
//	@Test(priority = 3)
//	public void payment() {
//		
//		System.out.println("payment test case");
//	}
//	
	@Test(priority = 1)
	public void login() {
		
		System.out.println("login test case");
	}
	
	@Test(priority = 4)
	public void logout() {
		System.out.println("logout test case");
		
	}
	
	@Test(priority = 2)
	public void addItemsToCart() {
		
		System.out.println("addItemsToCart test case");
	}
	
	
	
}

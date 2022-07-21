package unitTestExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AmazonTest {
	
	
	//Unit Testing Framework
	
	//pre-condition ---- @Before
	//Test ----test case @Test
	//post-condition ----@After
	
	@Before
	public void launchApp() {
		
		System.out.println("launching application");
	}
	
	@After
	public void closeApp() {
		System.out.println("closing application");
		
	}
	
	@Test
	public void login() {
		
		System.out.println("login test case");
	}
	
	
	
	
	
	
	

}

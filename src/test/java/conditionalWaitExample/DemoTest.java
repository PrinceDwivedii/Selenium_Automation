package conditionalWaitExample;

import org.testng.annotations.Test;

public class DemoTest {
	
	
	
	
	@Test
	public void test1() {
		
		
		//creating an object
		Employee emp = new Employee("Amit", 1001);
		emp.getName();
		emp.getEMPID();
		
		
		System.out.println("============================");
		
		Employee emp1 = new Employee("Abhishek", 1002);
		emp1.getName();
		emp1.getEMPID();
		
	}
	
	
	

}

package conditionalWaitExample;

public class Employee {

	String localname;
	int localempID;

	public Employee(String name, int empID) {

		localname = name;
		localempID = empID;

	}

	public void getName() {

		System.out.println("Name: " + localname);
	}

	public void getEMPID() {

		System.out.println("EMPID: " + localempID);
	}

}

package JavaConcepts;

//THIS KEY WORD

public class Employee {
	
	int empId;
	String empName, empDesg, empDept;
	
	public Employee(int empId, String empName, String empDesg, String empDept)
	{
		this.empId = empId;
		this.empName = empName;
		this.empDesg = empDesg;
		this.empDept = empDept;
	}

	public static void main(String[] args) {

	Employee e1 = new Employee(101, "John", "Tester","QA");
	System.out.println("Details of Employee 1");
	System.out.println("Employee ID is: "+ e1.empId);
	System.out.println("Employee Name is: "+e1.empName);
	System.out.println("Employee Designation is: "+e1.empDesg);
	System.out.println("Employee Department is: "+e1.empDept);
	
	System.out.println("-------");
	
	Employee e2 = new Employee(102, "Peter", "Developer","Dev");
	System.out.println("Details of Employee 2");
	System.out.println("Employee ID is: "+ e2.empId);
	System.out.println("Employee Name is: "+e2.empName);
	System.out.println("Employee Designation is: "+e2.empDesg);
	System.out.println("Employee Department is: "+e2.empDept);

	}

}

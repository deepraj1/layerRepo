
public class Employee {
	public final int a=500;
	
	/*
	// The blank final field a may not have been initialized
	//if the perticula method is not availaable in current class then it look into parent class other wise ges on on to grand parent
//	interfaces->abstract class->concrete class
//	abstact classs have only declaration
//	constructor can be declareed bit no object creations
//	when we are extendly to any other class then all abstract method, must be averridden.if we will not do it then marks chinld class a sabstract
//	concrete commanly required funcationaly or not
	
//	a class can implemets N no of class 
//	CN has to override all interfaces methods if not then mark CN as abstract class
	
	
//	interfaces can extend(s) interface(s)
//	interface I1{} // 3 abstract method
//	interface I2 extends I1{} 2 methods
//	class CN implements I2{} then class should override 5 methods
	
	a single java file one public class/interface
	
//	interface can't implemet class/interface
 * 
 * 
 * 
 * 
 * 
 * 
//	class cant extend interface

	
	
	
	
	
	*/
	
	
	
	
	
	private String empId;
	private String firstName;
	private String lastName;
	private String location;
	private float salary;
	
//	public Employee() {
//		// TODO Auto-generated constructor stub
//		System.out.println("hello from emp");
//	}

	
	
	public Employee(String empId, String firstName, String lastName, String location, float salary) {
	
		super();
//		this.a = 0;
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
		this.salary = salary;
	}
	
	
	public Employee(String empId, String firstName, String lastName) {
	
	super();
	this.a = 0;
	this.empId = empId;
	this.firstName = firstName;
	this.lastName = lastName;
}
	
	public float salaryCal(float salary) {
		return salary;
	}


	public Employee(String location, float salary) {
		
		super();
		this.location = location;
		this.salary = salary;
		this.a = 0;
	}


	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getSalary() {
		return salary;
	}
	private void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	
	
}

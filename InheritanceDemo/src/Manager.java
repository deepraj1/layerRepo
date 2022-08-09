
public class Manager extends Employee {
	private String projectName;
	private float projectAllowance;
	
//
//	public Manager(String empId, String firstName, String lastName, String location, float salary, float projectAllowance, String projectNames) {
//		super(empId, firstName, lastName,location,salary);
//		this.projectAllowance = projectAllowance;
//		this.projectName = projectName;
//		
//	}

//	public Manager(String empId, String firstName, String lastName, float projectAllowance, String projectName) {
//		super(empId, firstName, lastName);
//		// TODO Auto-generated constructor stub
//		
//	}
//
//	public Manager(String location, float salary,float projectAllowance, String projectName) {
//		super(location, salary);
//		// TODO Auto-generated constructor stub
//	}
	
	
	
	
	
	
	
	
	
	
	public float salaryCal(float salary , float projectAllowance) {
		float result = salary +projectAllowance;
		return result;
		
	}
	public Manager(String empId, String firstName, String lastName) {
		super(empId, firstName, lastName);
		// TODO Auto-generated constructor stub
	}
	@Override
	public float salaryCal(float salary) {
		// TODO Auto-generated method stub
		return super.salaryCal(salary);
	}
	public float getProjectAllowance() {
		return projectAllowance;
	}
	public void setProjectAllowance(float projectAllowance) {
		this.projectAllowance = projectAllowance;
	}
	
	

}

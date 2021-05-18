package orgs.capg.apps.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee2{
	
		@Value("${emploee.employeeId}")	 
	private int employeeId;
		@Value("${emploee.employeeName}")
	private String employeeName;
		@Value("${emploee.salary}") 
	private double salary;
		@Value("${emploee.businessUnit}")
	private String businessUnit;
		@Value("${emploee.age}")
	private int age;

	private SBU sbu;



	public Employee2(int employeeId, String employeeName, double salary, String businessUnit, int age,SBU sbu) {

		this.sbu=sbu;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
	}	


	public Employee2() {
		// TODO Auto-generated constructor stub
	}

	public SBU getSbu() {
		return sbu;
	}
@Autowired
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void display(Employee2 employee)
	{
		System.out.println("Employee id="+employee.getEmployeeId()+"Employee name="+employee.getEmployeeName()+"salary="+employee.getSalary()+"age="+employee.getAge()+
		"SBU details=SBU [ sbu code="+employee.getSbu()+"sbu head="+employee.getSbu()+"sbu name="+employee.getSbu());


	}
}




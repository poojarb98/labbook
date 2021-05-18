package org.capg.apps.beans;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Employee  {
	//@Value("${emploee.EmployeeId}")	 
private int employeeId;
	//@Value("${emploee.EmployeeName}")
private String employeeName;
	//@Value("${emploee.salary}") 
private double salary;
	//@Value("${emploee.salary}")
private String businessUnit;
	//@Value("${emploee.age}")
private int age;
//private SBU sbudetails;



public Employee(int employeeId, String employeeName, double salary, String businessUnit, int age) {

	//this.sbudetails=sbuDetails;
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.salary = salary;
	this.businessUnit = businessUnit;
	this.age = age;
}	


public Employee() {
	// TODO Auto-generated constructor stub
}

/*public SBU getSbudetails() {
	return sbudetails;
}


public void setSbudetails(SBU sbudetails) {
	this.sbudetails = sbudetails;
}*/


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

public void display(Employee employee)
{
	System.out.println("Employee id="+employee.getEmployeeId()+"Employee name="+employee.getEmployeeName()+"salary="+employee.getSalary()+"business unit="+employee.getBusinessUnit()+"age="+employee.getAge());
}


}


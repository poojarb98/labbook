package org.capg.apps.employee;


import org.capg.apps.beans.Employee;
import org.capg.apps.beans.SBU;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	 public static void main( String[] args )
	    {
	        App app=new App();
	        app.start();
	    }

	    public void start(){
	       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
	      
	       Employee employee=context.getBean(Employee.class);
	     
	      display(employee );
	       //System.out.println("employee details");
	       //System.out.println("Id="+employee.getEmployeeId()+"\nName="+employee.getEmployeeName()+"\nsalary="+employee.getSalary()+"\nbusiness unit="+employee.getBusinessUnit()+"\nage="+employee.getAge());
	   
	      }
		/*public void display(Employee employee) {
			System.out.println("Id="+employee.getEmployeeId()+"\nName="+employee.getEmployeeName()+"\nsalary="+employee.getSalary()+"\nbusiness unit="+employee.getBusinessUnit()+"\nage="+employee.getAge());
			   
			
		}*/

		private void display(Employee employee) {
			System.out.println("Id="+employee.getEmployeeId()+"\nName="+employee.getEmployeeName()+"\nsalary="+employee.getSalary()+"\nbusiness unit="+employee.getBusinessUnit()+"\nage="+employee.getAge());
			   
			
		}

		

}

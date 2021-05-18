package orgs.capg.apps.employee2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import orgs.capg.apps.beans.Employee2;

public class App {
	
		 public static void main( String[] args)
		    {
		        App app=new App();
		        app.start();
		    }

		    public void start(){
		       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		      
		       Employee2 employee=context.getBean(Employee2.class);
		     
		    
			display( employee );
		       //System.out.println("employee details");
		       //System.out.println("Id="+employee.getEmployeeId()+"\nName="+employee.getEmployeeName()+"\nsalary="+employee.getSalary()+"\nbusiness unit="+employee.getBusinessUnit()+"\nage="+employee.getAge());
		   
		      }
			/*public void display(Employee employee) {
				System.out.println("Id="+employee.getEmployeeId()+"\nName="+employee.getEmployeeName()+"\nsalary="+employee.getSalary()+"\nbusiness unit="+employee.getBusinessUnit()+"\nage="+employee.getAge());
				   
				
			}*/

			public void display(Employee2 employee) {
				System.out.println("Id="+employee.getEmployeeId()+"\nName="+employee.getEmployeeName()+"\nsalary="+employee.getSalary()+"\nbusiness unit="+employee.getBusinessUnit()+"\nage="+employee.getAge());
				   
				
			}

			

	}



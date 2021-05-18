package orgs.capg.app.lab3;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import orgs.capg.app.beans.Employee3;
import orgs.capg.app.beans.SBU;

public class App {
	public static void main(String[]args)
	{
		App app=new App();
		app.start();
	}
	public void start()
	{
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		SBU sbu=context.getBean(SBU.class);
		ArrayList<Employee3> list=sbu.getEmpList();
		Employee3 employee=context.getBean(Employee3.class);
		display(employee,list);
		
	}
	public void display(Employee3 employee,ArrayList<Employee3>list) {
		for(Employee3 emp:list)
		{
			System.out.println(emp.getEmployeeName()+emp.getAge()+emp.getEmployeeId()+emp.getSalary());
		}
	}

}

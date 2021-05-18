package orgs.capg.app.lab3;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.sun.tools.javac.util.List;

import orgs.capg.app.beans.Employee3;
import orgs.capg.app.beans.SBU;
@ComponentScan("orgs.capg.app.lab3")
@PropertySource("classpath:app.properties")
@Configuration
public class JavaConfig {
	@Bean
	public SBU getSBU()
	{
		SBU sbu=new SBU();
		ArrayList<Employee3>list=employeesList();
		sbu.setEmpList(list);
		return sbu;
	}
	public ArrayList<Employee3> employeesList(){
		ArrayList<Employee3> empList=new ArrayList<Employee3>();
		Employee3 emp1=new Employee3(1234,"pooja",5000,25);
		empList.add(emp1);
		return empList;
	}

}

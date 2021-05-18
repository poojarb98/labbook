package org.capg.apps.employee;

import org.capg.apps.beans.Employee;
import org.capg.apps.beans.SBU;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("org.capg.apps.employee")
@Configuration
@PropertySource("classpath:app.properties")
public class JavaConfig{
	@Bean
public Employee getEmployee()
{
	
	return new Employee(1234,"Harriet",40000,"PES_BU",40);
}
	/*@Bean
	public SBU getSbu()
	{
		return new SBU(1234,"pooja","teanm",getEmployee());
	}*/
}

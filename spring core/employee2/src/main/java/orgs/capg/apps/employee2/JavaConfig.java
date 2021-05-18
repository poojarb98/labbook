package orgs.capg.apps.employee2;

import org.springframework.context.annotation.ComponentScan;

import orgs.capg.apps.beans.Employee2;

import orgs.capg.apps.beans.SBU;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("orgs.capg.apps.employee2")
@PropertySource("classpath:app.properties")
public class JavaConfig {


}

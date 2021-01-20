package app.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import app.core.persons.Person;

@ComponentScan
@Configuration
public class SpringConfig {
	@Bean
	@Scope("singleton")
	public Person theManager () {
		Person mgr = new Person();
		mgr.setId(1);
		mgr.setName("Mgr");
		mgr.setAge(40);
		return mgr;
	}
	@Bean
	@Scope("prototype")
	public Person theEngineer () {
		Person eng = new Person();
		eng.setId(2);
		eng.setName("Eng");
		eng.setAge(30);
		return eng;
	}
	@Bean
	@Scope("prototype")
	public Person worker () {
		Person mgr = new Person();
		return mgr;
	}
}

package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.animal.Animal;
import app.core.persons.Person;

public class SpringApplication {
	public static void main(String[] args) {

		System.out.println("app started");
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);) {
			Person p1 =  ctx.getBean("theManager", Person.class);
			Person p2 =  ctx.getBean("theEngineer", Person.class);
			Person p3 =  ctx.getBean("person", Person.class);
			Animal a1 = ctx.getBean(Animal.class);
			Animal a2 = ctx.getBean(Animal.class);
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println(a1);
			System.out.println(a2);
		}
	}
}

package matalaOopAsherplotnik;

import java.util.Arrays;

public class Student extends Person{

	Grade[] grades;

	public Student(int age, String name, Grade[] grades) {
		super(age, name);
		this.grades = grades;
	}
	
	

	public Grade[] getGrades() {
		return grades;
	}



	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}



	@Override
	public String toString() {
		return "[grades=" + Arrays.toString(grades) + ", getAge()=" + getAge() + ", getName()=" + getName()
				+ "]";
	}
	
	
	
	

	

}

package myExerciseSchool;

import java.util.Arrays;

public class Student {
	private int[] grades;
	private String name;
	
	public Student() {
		grades = new int[10];
		for (int i = 0; i < 10; i++) {
			grades[i] = (int)(Math.random()*101);
		}
		name = "student-" + (char)((Math.random()*24)+66)+(char)((Math.random()*24)+66);	
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAverageGrade() {
		double sum = 0;
		for (int grade : grades) {
			sum+= grade;
		}
		return sum/grades.length;		
	}
	
	
	public int[] getGrades() {
		return grades;
	}
	
	public void printGrades () {
		System.out.print(Arrays.toString(getGrades()) + " name: " +getName()+ " average: "+getAverageGrade() +"\n");
	}
	

	
	
	

}

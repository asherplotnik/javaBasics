package oop;

public class Student {

	private String name;
	private String course;
	private int grade1;
	private int grade2 ;
	private int grade3 ;
	
	public Student(String name, String course, int grade1, int grade2, int grade3) {
		this.name = name;
		this.course = course;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}
	
	public String getName() {
		return name;
	}


	public String getCourse() {
		return course;
	}


	public int getGrade1() {
		return grade1;
	}


	public int getGrade2() {
		return grade2;
	}


	public int getGrade3() {
		return grade3;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}


	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}


	public void setGrade3(int grade3) {
		this.grade3 = grade3;
	}
	


	
	
	public double gradesAvg() {
		return (grade1+grade2+grade3)/3.0;
	}
	
	public void print() {
		System.out.println("name: " + name + " course: " + course + " first grade: " + grade1 +  " second grade: " + grade2 +  " third grade: " + grade3 );
		
	}


	
}

package myExerciseSchool;

public class Classroom {
	
	private Student[] students;
	private Student topStudent;

	public Classroom() {
		students = new Student[5];
		for (int i = 0; i < 5; i++) {
			students[i] = new Student();
		}
		checkTopStudent();
	}
	
	public Student[] getStudents() {
		return students;
	}
	
	
	
	public Student getTopStudent() {
		return topStudent;
	}

	public double getAverageClassGrade() {
		double sum = 0;
		for (Student student : students) {
			sum += student.getAverageGrade();
		}
		return sum/students.length;
	}
	
	public Student checkTopStudent() {
		Student temp = null;
		double max = 0;
		for (Student student : students) {
			if (student.getAverageGrade() > max) {
				max = student.getAverageGrade();
				temp = student;
			}
		}
		topStudent = temp;
		return temp;
	}
	
	public  void printClass() {
		for (Student student : students) {
			student.printGrades();
		}
		System.out.println("average class grade :"+ getAverageClassGrade());
		System.out.println("top student: "+checkTopStudent().getName());
	}
	

}

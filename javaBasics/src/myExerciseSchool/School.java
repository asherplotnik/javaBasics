package myExerciseSchool;

public class School {
	Classroom[] classrooms;
	Student topSchoolStudent ;

	public School() {
		classrooms = new Classroom[5];
		for (int i = 0; i < classrooms.length; i++) {
			classrooms[i] = new Classroom();
		}
		getTopSchoolStudent();
	}

	public double getAverageSchoolGrade() {
		double sum = 0;
		for (Classroom currClass : classrooms) {
			sum += currClass.getAverageClassGrade();
		}
		return sum / classrooms.length;
	}
	
	public Student getTopSchoolStudent() {
		Student temp = null;
		double max = 0;
		for (Classroom currClass : classrooms) {
			if (currClass.checkTopStudent().getAverageGrade() > max) {
				max = currClass.checkTopStudent().getAverageGrade();
				temp = currClass.checkTopStudent();
			}
		}
		topSchoolStudent = temp;
		return temp;
	}
	
	public void printSchool() {
		for (Classroom curr: classrooms) {
			curr.printClass();
		}
		System.out.println("average school grade :"+ getAverageSchoolGrade());
		System.out.println("top school student: "+getTopSchoolStudent().getName());
	}
	
	public static void main(String[] args) {
		School johnBryce = new School();
		johnBryce.printSchool();
		
		
	}

}

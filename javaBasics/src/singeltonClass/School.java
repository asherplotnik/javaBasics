package singeltonClass;

public class School {
	
	private static School instance = new School(); 
	
	private Student[] students;
	
	private School() {
		students = new Student[100];
	}
		
	public School getInstance() {
		return instance;
	}
	
	public void addStudent(Student student) {
		for (int i = 0;i < students.length;i++) {
			if (students[i]!= null) {
				students[i] = student;
				break;
			}
		}
	}

}

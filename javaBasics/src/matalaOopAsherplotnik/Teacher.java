package matalaOopAsherplotnik;

public class Teacher extends Person{

	ProfessionEnum teacherProfession ;

	public Teacher(int age, String name, ProfessionEnum teacherProfession) {
		super(age, name);
		setTeacherProfession(teacherProfession);
	}

	public ProfessionEnum getTeacherProfession() {
		return teacherProfession;
	}

	public void setTeacherProfession(ProfessionEnum teacherProfession) {
		this.teacherProfession = teacherProfession;
	}

	@Override
	public String toString() {
		return "Teacher [" + teacherProfession + ", age" + getAge() + ", " + getName()
				+ "]";
	}
	
	
	

}

package matalaOopAsherplotnik;

import java.util.Arrays;

public class School {

	ClassRoom[] classrooms;

	public School(int num) {
		this.classrooms = new ClassRoom[num];
	}

	public ClassRoom[] getClassrooms() {
		return classrooms;
	}

	@Override
	public String toString() {
		return "School [classrooms= \n" + Arrays.toString(classrooms) + "]";
	}
	
	

	
	
	
	
	

}

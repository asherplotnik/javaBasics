package matalaOopAsherplotnik;

public class Person {
	
	private int age;
	private String name;
	
	public Person(int age, String name) {
		setAge(age);
		setName(name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 20 && age <= 120) {
			this.age = age;			
		} else {
			System.out.println("failed to set, " + age + " invalid age : set default to 20" );
			this.age = 20;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}

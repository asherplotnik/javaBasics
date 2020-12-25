package threading.ex2;

public class Person {
	private int id=0;
	private long cc;
	private String name="";
	
	public synchronized int  getId() {
		return id;
	}

	public synchronized void setId(int id) {
		this.id = id;
	}

	public synchronized long getCc() {
		return cc;
	}

	public synchronized void setCc(long cc) {
		this.cc = cc;
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	
	public Person (long cc) {
		this.cc = cc;	
	}

	public Person(int id, long cc, String name) {
		this.id = id;
		this.cc = cc;
		this.name = name;
	}
}

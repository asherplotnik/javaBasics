package threading.ex2;

public class Person {
	private int id=0;
	private long cc;
	private String name="";
	private int approved = 0;
	
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

	public synchronized int getApproved() {
		return approved;
	}

	public synchronized void setApproved(int approved) {
		this.approved = approved;
	}
	public Person (long cc) {
		this.cc = cc;	
	}

	public Person(int id, long cc, String name) {
		this.id = id;
		this.cc = cc;
		this.name = name;
		this.approved = 0;
	}
}

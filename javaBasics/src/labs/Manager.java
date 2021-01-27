package labs;

public class Manager extends Employee{

	public Manager(String first, String last, double salary, String depatment) {
		super(first, last, salary, depatment);
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Manager";
	}




	@Override
	public String getFirst() {
		return super.getFirst();
	}

	@Override
	public void setFirst(String first) {
		super.setFirst(first);
	}

	@Override
	public String getLast() {
		return super.getLast();
	}

	@Override
	public void setLast(String last) {
		super.setLast(last);
	}

	@Override
	public double getSalary() {
		return super.getSalary();
	}

	@Override
	public void setSalary(double salary) {
		super.setSalary(salary);
	}

	@Override
	public String getDepatment() {
		return super.getDepatment();
	}

	@Override
	public void setDepatment(String depatment) {
		super.setDepatment(depatment);
	}


	

}

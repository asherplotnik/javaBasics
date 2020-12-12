package labs;

public class Employee {
	 String first;
	 String last;
	 double salary;
	 String depatment;
	public Employee(String first, String last, double salary, String depatment) {
		this.first = first;
		this.last = last;
		this.salary = salary;
		this.depatment = depatment;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepatment() {
		return depatment;
	}
	public void setDepatment(String depatment) {
		this.depatment = depatment;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee";
	}

	

}

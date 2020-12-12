package labs;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Asher","Plotnik",1000D,"Sales"));
		list.add(new Employee("Berney","Johnson",2000D,"Sales"));
		list.add(new Employee("Bob","Cohen",2000D,"Legal"));
		list.add(new Manager("Bob","Cohen",2000D,"Legal"));
		list.add(null);
		
		
		
		System.out.println(EmployeeStatistics.getManPowerReport(list));
		
		
	}
	
	
}

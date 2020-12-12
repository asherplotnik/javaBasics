package labs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeStatistics {

	public static double avarageSalary(List<? extends Employee> employees) {
		double sum = 0;
		double counter = 0;
		for (Employee emp : employees) {
			if (emp != null) {
				sum += emp.getSalary();
				counter++;
			}
		}

		return sum / counter;

	}

	public static int numOfEmplyees(List<? extends Employee> employees, String dep) {
		int sum = 0;
		for (Employee emp : employees) {
			if (emp != null && emp.getDepatment().equalsIgnoreCase(dep))
				sum++;
		}
		return sum;

	}

	public static int numOfEmplyees(List<? extends Employee> employees) {
		int sum = 0;
		for (Employee emp : employees) {
			if (emp != null)
				sum++;
		}
		return sum;

	}
	
	public static List<Manager> getManagers(List<Employee> emps){
		List<Manager> res = new ArrayList<>();
		for (Employee emp :emps) {
			if (emp instanceof Manager) {
				res.add((Manager)emp);
			}
		}
		
		return res;
		
	}
	
	public static Map<String, Integer> getManPowerReport(List<Employee> emps){
		Map<String, Integer> map = new HashMap<>();
		map.put("managers", getManagers(emps).size());
		map.put("employees", numOfEmplyees(emps) - getManagers(emps).size());
		return map;
	}
	
	public static <T extends Employee>void insertEmployees(List<T> source, List<? super T> destination) {
		destination.addAll(source);
	}

}

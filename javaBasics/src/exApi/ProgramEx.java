package exApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class ProgramEx {
	private static int nextTaskId  = 1 ;
	private static final Scanner scan = new Scanner(System.in);
	
	public static Task getTeskFromUser() {
		System.out.print("Enter task description: ");
		String description = scan.nextLine();
		System.out.print("Enter time:  hh:mm:ss   ");
		String time = scan.nextLine();
		LocalDateTime deadline  = LocalDateTime.of(LocalDate.now(), LocalTime.parse(time));
		Task task = new Task(nextTaskId++,description,deadline);
		return task;
	}
	
	public static void switchMenu(Scheduler scheduler) {
		while (true) {
			System.out.println("Enter Operation: ");
			System.out.println("a  to add a task. ");
			System.out.println("b  to display a task. ");
			System.out.println("c  to mark task as done a task. ");
			System.out.println("d  to start monitor tasks. ");
			System.out.println("e  to stop monitor tasks. ");
			System.out.println("x  to exit. ");
			String s = scan.nextLine();
			switch(s) {
				case "a":
					scheduler.addTask(getTeskFromUser());
					break;
				case "b":
					System.out.println("Enter task id: ");
					int tId = Integer.parseInt(scan.nextLine());
					System.out.println(scheduler.getTask(tId));
					break;
				case "c":
					System.out.println("Enter task id: ");
					int dId = Integer.parseInt(scan.nextLine());
					scheduler.getTask(dId).setDone(true);
					break;
				case "d":
					scheduler.startMonitoringTasks();
					break;
				case "e":
					scheduler.stopMonitoringTasks();
					break;
				case "x":
					scheduler.stopMonitoringTasks();
					return;				
			}
		}
	}

	public static void main(String[] args) {
		Scheduler scheduler = new Scheduler();
		switchMenu(scheduler);
		

	}

}

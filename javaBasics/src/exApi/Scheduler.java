package exApi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Scheduler {
	private List<Task> tasks = new ArrayList<>();
	private boolean monitoringActive = false ;
	//private long checkRateMilis;
	public synchronized void addTask(Task task) {
		tasks.add(task);
	}
	private SchedulerRunnable schedulerRunner = new SchedulerRunnable(this);
	private Thread schedulerThread = new Thread(schedulerRunner,"st1");
	
	public synchronized boolean isMonitoringActive() {
		return monitoringActive;
	}
	

	public synchronized void remove(int id) {
		for (int i = 0 ; i< tasks.size();i++) {
			if(tasks.get(i).getId() == id) {
				tasks.remove(i);
				break;
			}
		}
	}

	public void displayTasks() {
		for (Task task : tasks) {
			System.out.println(task);
		}
	}
	
	public synchronized Task getTask(int id) {
		for (int i = 0 ; i< tasks.size();i++) {
			if(tasks.get(i).getId() == id) {
				return tasks.get(i);
			}
		}
		return null;
	}
	
	public synchronized List<Task> getAllTasks(){
		return tasks;
	}
	
	public synchronized void stopMonitoring() {
		schedulerThread.interrupt();
	}
	
	public synchronized List<Task> getAllTasksDueUntil(LocalDateTime due) {
		List<Task> temp = new ArrayList<>();
		for (int i = 0 ; i< tasks.size();i++) {
			if(tasks.get(i).getDeadline().isBefore(due)) {
				temp.add(tasks.get(i));
			}
		}
		return temp;
	}
	
	public  synchronized void startMonitoringTasks() {
		System.out.println(schedulerThread.getState());
		if (schedulerThread.isAlive()) {
			System.out.println("Allready monitoring !!!");
			return;
		} else {
			monitoringActive=true;			
			schedulerThread.start();
			System.out.println("monitoring status = " + monitoringActive);
		}
	}
	public synchronized void pauseMonitoringTasks() {
		monitoringActive = !monitoringActive;	
		System.out.println("monitoring status = " + monitoringActive);
	}
	
	public synchronized void checkDeadlines() {
		LocalDateTime now = LocalDateTime.now();
		for (Task task : tasks) {
			if (task.getDeadline().isBefore(now) && !task.isAlertPopped() && !task.isDone()) {
				System.out.println("!!! DEADLINE ALERT !!!" + task);
				task.setAlertPopped(true);
			}
		}
	}
	
	
}

package matalaApiAsherPlotnik.EldarReminder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ReminderSystem {
	
	private Scanner scanner=new Scanner(System.in);
	private Set<Reminder> reminders;
	private ReminderTask task;
	
	public ReminderSystem() {
		reminders=new TreeSet<>();
		task=new ReminderTask(reminders);
		new Thread(task).start();
		reminderMenu();
	}
	
	public boolean addReminder(Reminder r) {
		Calendar curr=Calendar.getInstance();
		if(curr.before(r.getExpiration()))
			return reminders.add(r);
		return false;
	}
	
	public List<Reminder> getReminders(){
		List<Reminder> temp=new ArrayList<Reminder>(reminders);
		Collections.sort(temp);
		return temp;
	}
	
	public void reminderMenu() {
		int choice=0;
		do {
			System.out.println("REMINDER MENU (1-3)");
			System.out.println("1 Create A New Reminder");
			System.out.println("2 View Reminders");
			System.out.println("3 Quit");
			choice=scanner.nextInt();
			switch(choice) {
				case 1: handleAddReminder();
						break;
				case 2: handleReminderList();
						break;
				case 3: scanner.close();
					    handleExit();
			}
		}while(choice!=3);
		
	}
	
	private void handleAddReminder() {
		System.out.println("\nCreate New Reminder:");
		System.out.println("Enter Day of Month");
		int day=scanner.nextInt();
		System.out.println("Enter Month");
		int month=scanner.nextInt()-1;
		System.out.println("Year");
		int year=scanner.nextInt();
		System.out.println("Enter Hour (0-24)");
		int hour=scanner.nextInt();
		System.out.println("Enter Minutes");
		int min=scanner.nextInt();
		System.out.println("Enter Reminder Text");
		String text=scanner.next();
		System.out.println("Set As Important ? (Y/N)");
		String tmp=scanner.next();
		char c=tmp.charAt(0);
		boolean important=c=='Y'?true:false;
		Calendar expiration=Calendar.getInstance();
		expiration.set(Calendar.DAY_OF_MONTH, day);
		expiration.set(Calendar.MONTH, month);
		expiration.set(Calendar.YEAR, year);
		expiration.set(Calendar.HOUR_OF_DAY, hour);
		expiration.set(Calendar.MINUTE, min);
		Reminder r=new Reminder(expiration, text, important);
		addReminder(r);
	}
	
	private void handleReminderList() {
		System.out.println("\nReminder List");
		for(Reminder r:reminders) {
			System.out.println(r);
		}
		System.out.println();
	}
	
	private void handleExit() {
		scanner.close();
		System.exit(0);
	}
}

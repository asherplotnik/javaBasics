package matalaApiAsherPlotnik.EldarReminder;

import java.util.Calendar;
import java.util.Set;

public class ReminderTask implements Runnable {
	
	private Set<Reminder> reminders;
	
	
	public ReminderTask(Set<Reminder> reminders) {
		this.reminders=reminders;
	}
	
	@Override
	public void run() {
		while(true) {
			Calendar curr=Calendar.getInstance();
			for(Reminder r:reminders) {
				if(curr.get(Calendar.DAY_OF_MONTH)==r.getExpiration().get(Calendar.DAY_OF_MONTH)&&
				   curr.get(Calendar.MONTH)==r.getExpiration().get(Calendar.MONTH)&& 
				   curr.get(Calendar.YEAR)==r.getExpiration().get(Calendar.YEAR)&&
				   curr.get(Calendar.HOUR_OF_DAY)==r.getExpiration().get(Calendar.HOUR_OF_DAY)&&
				   curr.get(Calendar.MINUTE)==r.getExpiration().get(Calendar.MINUTE)&&
				   !r.isPoped()){
						System.out.println(r);
						r.setPoped(true);
						if(r.isImportant()) {
						    (new Thread(new ImportantReminderTask(r))).start();
						}
				}
			}
			try {Thread.sleep(1000*60);}catch(Exception e) {}
		}
	}

}

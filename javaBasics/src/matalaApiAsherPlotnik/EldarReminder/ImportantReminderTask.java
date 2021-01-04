package matalaApiAsherPlotnik.EldarReminder;

public class ImportantReminderTask implements Runnable {

	private Reminder r;

	public ImportantReminderTask(Reminder r) {
		this.r=r;
	}
	
	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			try {Thread.sleep(1000*30);}catch(Exception e) {}
			System.out.print(r);
			if(i==0)
				System.out.println("  *** Second Call ***");
			else
				System.out.println("  ***  Last Call  ***");
		}

	}

}

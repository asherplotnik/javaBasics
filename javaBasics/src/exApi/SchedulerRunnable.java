package exApi;

public class SchedulerRunnable implements Runnable {
	Scheduler scheduler;
	public SchedulerRunnable(Scheduler scheduler) {
		this.scheduler = scheduler;
	}

	@Override
	public void run() {
		int count = 0;
				try {
					while (true) {
						synchronized (scheduler.getAllTasks()){
						if (scheduler.isMonitoringActive())
							scheduler.checkDeadlines();
						Thread.sleep(1000);
						if (++count == 10) { // print only every 10 seconds
							System.out.println("---monitoring---" + scheduler.isMonitoringActive());
							count = 0;
						}
						}
					}
				} catch (InterruptedException e) {
					System.out.println("Finished!!!");				
				}
	}

}

package exApi;

public class SchedulerRunnable implements Runnable{
	Scheduler scheduler;
	public SchedulerRunnable (Scheduler scheduler) {
		this.scheduler = scheduler;
	}

	@Override
	public void run() {
		Thread curr = Thread.currentThread();
		try {
			int count = 0;
			while (true) {
				scheduler.checkDeadlines();
				Thread.sleep(1000);
				if (++count == 10) {
					System.out.println("---monitoring---");
					count = 0;
				}
				if (curr.isInterrupted())
					return;
			}
		} catch (InterruptedException e) {
			return;
		}
	}

}

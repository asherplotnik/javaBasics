package matalaApiAsherPlotnik;

public class ImportantOrderTaskRunnable implements Runnable{

	private String notification = ""; 
	
	public ImportantOrderTaskRunnable(String notification) {
		 this.notification = notification;
	}
	@Override
	public void run() {
		
		try {
			Thread.sleep(60000);
			for (int i = 0; i < 3; i++) {
				System.out.println(notification);
				Thread.sleep(60000);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	

}

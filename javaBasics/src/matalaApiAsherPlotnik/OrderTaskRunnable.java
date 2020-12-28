package matalaApiAsherPlotnik;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class OrderTaskRunnable implements Runnable{
	
	private Set<Order> orders = new TreeSet<>();
	private List<String> notifications = new ArrayList<String>();
		
	public OrderTaskRunnable(Set<Order> orders) {
		this.orders = orders;
	}
	

	@Override
	public void run() {
		String notification = null;
		try {
			while (true) {
				Thread.sleep(1000);
				for (Order ord : orders) {
					if (ord.getExpiration().isBefore(LocalDateTime.now()) && !ord.isPoped()) {
							ord.setPoped(true);
							if (!ord.isImportant()) {
								notification = "[ALERT :("+ LocalDateTime.now() +")" + ord + "]";
								notifications.add(notification);
								System.out.println(notification);
							} else {
								notification = "[IMPORTANT ALERT :("+ LocalDateTime.now() +")" + ord + "]";
								System.out.println(notification);
								Thread importantTask = new Thread(new ImportantOrderTaskRunnable(notification),"IT1" + ord.getDescription());
								importantTask.start();
							}
					}
					
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Finished!!!");				
		}
		
	}

}

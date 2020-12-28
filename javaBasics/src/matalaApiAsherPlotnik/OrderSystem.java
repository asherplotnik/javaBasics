package matalaApiAsherPlotnik;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;


public class OrderSystem {
	private Set<Order> orders = null;
	OrderTaskRunnable taskRunnable ;
	Thread orderTask =null;
			
	public OrderSystem() {
		orders = new TreeSet<Order>();
		taskRunnable = new OrderTaskRunnable(orders);
		orderTask = new Thread(taskRunnable,"t1");
		orderTask.start();
	}
	public void addOrder(Order order) throws invalidOrderExcepition{
		if (order.getExpiration().isBefore(LocalDateTime.now())){
			
			throw new invalidOrderExcepition("Faild to add order -  date or time in the past is invalid!!!");
		}
		if (orders.add(order)) {
			System.out.println("Order added successfuly");			
		} else {
			throw new invalidOrderExcepition("Faild to add order - order already exists!!!");
		}
	}

	public Set<Order> getOrders() {
		return orders;
	}
	
	public void printOrders() {
		for (Order order : orders) {
			System.out.println(order);
		}
	}
	public Thread getOrderTask() {
		return orderTask;
	}
		
}

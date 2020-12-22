package threading;

public class MyRunnable implements Runnable{

	private long wait1;
	private long wait2;
	
	public MyRunnable(long wait1, long wait2) {
		super();
		this.wait1 = wait1 * 1000;
		this.wait2 = wait2 * 1000;
	}
	@Override
	
	public void run() {
		try {
			Thread.sleep(wait1);
			while (true) {
				Thread.sleep(wait2);
				System.out.println();
				System.out.println("Waitnig for Input!!!");
			}
		} catch (InterruptedException e) {
			System.out.println("Thanks!!!");
			return;
		}		
	}

	

}

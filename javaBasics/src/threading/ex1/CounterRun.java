package threading.ex1;

public class CounterRun implements Runnable{

	int num = 0;
	public CounterRun(int num) {
		this.num = num;
	}
	public void run(){
		Thread curr = Thread.currentThread();
		int i= 0;
		try {
			for (i = 0; i < num; i++) {
				System.out.println(curr.getName() + ":  " + i);
					Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			for (; i > 0; i--) {
				System.out.println(curr.getName() + " backwords:  " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
			}	
		}	
	}
}

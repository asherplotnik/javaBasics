package threading.ex1;

public class Program1 {


	public static void main(String[] args) throws InterruptedException {
		CounterRun counterRun = new CounterRun(10);
		Thread t1 = new Thread(counterRun,"t1");
		t1.start();
		Thread.sleep(6000);
		t1.interrupt();
	}
}

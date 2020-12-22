package threading;

public class TestNoSleep {

	public static void main(String[] args) throws InterruptedException {
		MyStopableThreadNoSleep t1 = new MyStopableThreadNoSleep("t1");
		t1.start();
		Thread.sleep(10);
		t1.interrupt();

	}

}

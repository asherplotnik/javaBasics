package threading.ex3;

public class Program3 {
	public  static void main(String[] args) {
		Flag flag = new Flag();
		Runner run = new Runner(flag,100);
		Thread  t1 = new Thread(run,"thread1");
		Thread  t2 = new Thread(run,"thread2");
		
		t1.start();
		t2.start();
	}	
}


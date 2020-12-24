package threading.ex3;

public class Program3  {
	public  static void main(String[] args) {
		
		
		
			
		Flag flag = new Flag();
		Runner run = new Runner(flag,100);
		Thread  t1 = new Thread(run,"thread1");
		Thread  t2 = new Thread(run,"thread2");
		Thread  t3 = new Thread(run,"thread3");
		Thread  t4 = new Thread(run,"thread4");
		Thread  t5 = new Thread(run,"thread5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}	
}


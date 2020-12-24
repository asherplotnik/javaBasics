package threading.ex3;

public class Runner implements Runnable{
	Flag flag;
	int num;
	public Runner(Flag flag,int num) {
		this.flag = flag;
		this.num = num;
	}
		
	public  void run() {
		
			Thread curr = Thread.currentThread();
			for (int i = 0; i < num; i++) {
				//System.out.print(curr.getName().charAt(6));
				synchronized (flag) { 
					if (flag.isRaised()) 
						return;
				}
			}
			System.out.println();
			//System.out.println("---");
			synchronized (flag) {
				if (flag.raiseFlag()) {
					System.out.println(" "+curr.getName() + " finished!!! ");
				} 
			}
	}
}

package threading.ex2;

public class CheckApproval implements Runnable{
	Person person;
	private int approved = 0;
	public CheckApproval(Person person) {
		this.person = person;
	}
	
	public synchronized int getApproved() {
		return approved;
	}

	public synchronized void setApproved(int approved) {
		this.approved = approved;
	}

	public void run () {
		int chk = (int)(Math.random()*11);
		try {
			System.out.println("trying CC number : " + person.getCc());
			Thread.sleep(5000);
			if (chk > 4) {
				setApproved(1);
			} else {
				setApproved(2);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

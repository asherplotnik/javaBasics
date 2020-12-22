package threading.ex2;

public class CheckApproval implements Runnable{
	Person person;
	
	public CheckApproval(Person person) {
		this.person = person;
	}

	public void run () {
		int chk = (int)(Math.random()*11);
		try {
			System.out.println("trying CC number : " + person.getCc());
			Thread.sleep(5000);
			if (chk > 4) {
				person.setApproved(1);
			} else {
				person.setApproved(2);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

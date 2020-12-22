package threading.ex3;
	
public class Flag  {
	private boolean raised = false;
	
	public boolean raiseFlag() {
		if (!raised) {
			this.raised = true;
			return true;
		} else {
			return false;
		}
		
	}
	
	
	public boolean isRaised() {
		return this.raised;
	}
	
}

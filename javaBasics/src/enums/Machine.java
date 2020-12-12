package enums;

public class Machine {

	private final int id;
	private State currentState;
	
	public Machine(int id, State state) {
		this.id = id; 
		setCurrentState(state);
		
	}
	
	
	public int getId() {
		return id;
	}


	public State getCurrentState() {
		return currentState;
	}


	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}


	public void print() {
		System.out.println(getId()+" "+getCurrentState());
	}
	
	public static void main(String[] args) {
		Machine m1 = new Machine(1,State.ON);
		m1.print();
		
	}
	

}

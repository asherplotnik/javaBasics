package cinema;
public class Cinema {
	private String[][] seats;
	public Cinema(int i, int j) {
		this.seats = new String[i][j];
	}
	
	public void add(String name, int i, int j){
		if (this.seats[i][j] == null) {
			this.seats[i][j] = name;
		} else {
			System.out.println("Seat is taken already!");
		}
	}
	
	public String remove(int i, int j){
		String name = this.seats[i][j];
		this.seats[i][j] = null;
		return name;
	}
	
	public void display(){
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				System.out.print("\t"+this.seats[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Cinema myCinema = new Cinema(5,10);
		myCinema.add("ash",2,2);
		myCinema.add("roy",2,2);
		myCinema.display();
	}
}

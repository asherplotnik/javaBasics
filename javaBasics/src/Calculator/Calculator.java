package Calculator;


/*
 * application layer  + datalayer
 * */


public class Calculator {
	//data layer
	private double result;
	
	public void add(double val) {
		result += val;
	}
	public void sub(double val) {
		result -= val;
	}
	public void mul(double val) {
		result *= val;
	}
	public void div(double val) {
		result /= val;
	}
	public double getResult() {
		return  this.result;
	}
	public void clear() {
		this.result = 0;
	}

}

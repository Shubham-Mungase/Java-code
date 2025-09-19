package day2;

public class InvalidOperator extends Exception {
	char opr;

	public InvalidOperator(char opr) {
		super();
		this.opr = opr;
	}

	@Override
	public String toString() {
		return "Invalid Operator = "+"'"+opr+"'";
	}
	

}

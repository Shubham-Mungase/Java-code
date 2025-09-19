package day2;

public class InvalidArgExp extends Exception{
	int value;

	public InvalidArgExp(int value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return "No of argument are wrong";
	}
}

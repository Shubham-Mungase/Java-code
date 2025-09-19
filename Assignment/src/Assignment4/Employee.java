package Assignment4;

public class Employee {
	int hrs,rate;
	String name;
	public Employee() {
		super();
	}
	public Employee(int hrs, int rate, String name) {
		super();
		this.hrs = hrs;
		this.rate = rate;
		this.name = name;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}

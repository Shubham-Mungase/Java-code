package day10;

public class Employee extends Person{

	int eno,salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address, long phno,int eno, int salary) {
		super(name, address, phno);
		this.eno = eno;
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		String str=super.toString();
		return "Employee [eno=" + eno + ", salary=" + salary + "]"+str;
	}
	
}

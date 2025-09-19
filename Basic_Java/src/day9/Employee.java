package day9;
//
public class Employee extends Department{
	private int empno,salary;
	private String empname;
	public Employee(int empno, int salary, String empname) {
		super();
		this.empno = empno;
		this.salary = salary;
		this.empname = empname;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int deptno, String deptname) {
		super(deptno, deptname);
		// TODO Auto-generated constructor stub
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	@Override
	public String toString() {
		String str=super.toString();
		return "Employee [empno=" + empno + ", salary=" + salary + ", empname=" + empname + "]"+str;
	}
	

}

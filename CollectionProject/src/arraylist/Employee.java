package arraylist;

import java.util.Objects;

public class Employee {
	int empid,salary;
	String name;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, int salary, String name) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empid, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid && Objects.equals(name, other.name) && salary == other.salary;
	}
	
	
	
	

}

package Assignment4;

import java.util.Scanner;

public class Manager extends Employee1{
	
	int salary;
	int insentive;
	public Manager() {
		super();
	}
	public Manager(String name, int id,int salary,int insentive) {
		super(name, id);
		this.salary=salary;		
		this.insentive=insentive;
	}
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getInsentive() {
		return insentive;
	}
	public void setInsentive(int insentive) {
		this.insentive = insentive;
	}
	public int computeSalary()
	{
		return salary+insentive;
	}
	
	@Override
	public String toString() {
		String str=super.toString();
		return "Manager [salary=" + salary + ", insentive=" + insentive + "]\n"+str;
	}
	public void readInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id :");
		setId(sc.nextInt());
		System.out.println("Enter Name :");
		setName(sc.next());
		System.out.println("Enter Insentive :");
		setInsentive(sc.nextInt());
		System.out.println("Enter Salary ");
		setSalary(sc.nextInt());
	}
	
	
	

	
}

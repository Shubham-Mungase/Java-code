package Assignment2;

import java.util.Scanner;

public class Company {
	
	
	int empid;
	String empname;
	double basicSal,netsal,grossal;
	double hra,medical,pf,pt;
	public Company(int empid, String empname, double basicSal, double netsal, double grossal, double hra,
			double medical, double pf, double pt) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.basicSal = basicSal;
		this.netsal = netsal;
		this.grossal = grossal;
		this.hra = hra;
		this.medical = medical;
		this.pf = pf;
		this.pt = pt;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
	public void hra(double sal)
	{
		double rent=(50/100);
		System.out.println("rent="+rent);
		hra=10000-rent;
		System.out.println("s="+hra);
	}
	public void calculate()
	{
		grossal=basicSal+hra+medical;
		netsal=grossal-(pt+pf);
	}
	
	@Override
	public String toString() {
		calculate();
		return "Company [empid=" + empid + ", empname=" + empname + ", basicSal=" + basicSal + ", netsal=" + netsal
				+ ", grossal=" + grossal + ", hra=" + hra + ", medical=" + medical + ", pf=" + pf + ", pt=" + pt + "]";
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Company c=new Company();
		c.hra(23456);
		System.out.println("Enter Employee Id :");
		c.setEmpid(sc.nextInt());
		System.out.println("Enter Employee Name :");
		c.setEmpname(sc.next());
		System.out.println("Enter Base Salary :");
		c.setBasicSal(sc.nextDouble());
		
		
	}
	
	
	

}
